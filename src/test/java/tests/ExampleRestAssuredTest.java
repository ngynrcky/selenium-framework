package tests;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class ExampleRestAssuredTest extends BaseApiTest{
    
    @Test
    public void exampleApiTest() {
        String url = "https://jsonplaceholder.typicode.com/todos/1";

        get(url).
        then().
        statusCode(200).
        body("userId", equalTo(1)).
        body("id", equalTo(1)).
        body("title", equalTo("delectus aut autem")).
        body("completed", equalTo(false)).body(matchesJsonSchemaInClasspath("schemas/jsonplaceholder/todos-schema.json"));
    }
}
