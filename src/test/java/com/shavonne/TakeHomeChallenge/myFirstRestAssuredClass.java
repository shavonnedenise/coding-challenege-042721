package com.shavonne.TakeHomeChallenge;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class myFirstRestAssuredClass {

    @Test
    public static void getResponseBody() {
        baseURI = "http://localhost:8080";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/message");

        String responseBody = response.getBody().asString();
        System.out.println("Response body is => " + responseBody);
    }

    @Test
    public void exampleTest() {
        given()
                .contentType(ContentType.JSON)
        .when()
            .get("http://localhost:8080/message")
        .then()
            .statusCode(200)
            .body("message", equalTo("Welcome to the machine."));
    }
}
