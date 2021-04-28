package com.shavonne.TakeHomeChallenge;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static io.restassured.RestAssured.given;

public class JSONTest extends FunctionalTest {

    @Test
    public void basic_Ping_Test() {
        given().when().get("/message").then().statusCode(200);
    }

    @Test
    public void verify_JSON_Message_Response_Body() {

        given().when().get("/message").then()
                .body("message", equalTo("Welcome to the machine."))
                .body("timestamp", containsStringIgnoringCase("2021"))
                .log().all();
    }

}
