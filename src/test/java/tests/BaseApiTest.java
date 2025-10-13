package tests;

import static io.restassured.RestAssured.filters;

import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseApiTest {
    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestResult result) {
        System.out.println("===== Starting test: " + result.getMethod().getMethodName() + " =====");
        filters(
                new RequestLoggingFilter(),
                new ResponseLoggingFilter(LogDetail.BODY),
                new ResponseLoggingFilter(LogDetail.STATUS));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        System.out.println("===== Ending test: " + result.getMethod().getMethodName() + " =====");
    }
}
