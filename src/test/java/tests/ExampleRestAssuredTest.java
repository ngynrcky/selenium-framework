package tests;

import static io.restassured.RestAssured.get;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ExampleRestAssuredTest extends BaseApiTest {

    @Test(groups = "smoke")
    public void exampleApiTest() {
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        String schemaPath = "schemas/jsonplaceholder/todos-schema.json";

        Response response = get(url).then()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("id", equalTo(1))
                .body("title", equalTo("delectus aut autem"))
                .body("completed", equalTo(false))
                .body(matchesJsonSchemaInClasspath(schemaPath))
                .extract()
                .response();

        long responseTime = response.getTime();
        System.out.println("Response time: " + responseTime + " ms");
        assertThat("Response time should be less than 1000 ms", responseTime, lessThan(1000L));
    }
}
