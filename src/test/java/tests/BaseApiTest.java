package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.filters;

import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class BaseApiTest 
{
    @BeforeMethod
    public void setUp(ITestResult result) {
        System.out.println("===== Starting test: " + result.getMethod().getMethodName() + " =====");
        filters(new RequestLoggingFilter(), new ResponseLoggingFilter(LogDetail.BODY), new ResponseLoggingFilter(LogDetail.STATUS));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        System.out.println("===== Ending test: " + result.getMethod().getMethodName() + " =====");
    }
}
