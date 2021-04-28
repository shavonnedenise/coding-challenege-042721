package com.shavonne.TakeHomeChallenge;

import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.given;


@SpringBootTest
public class JSONTest extends FunctionalTest {

    @Test
    public void basic_Ping_Test() {
        given().when().get("/").then().statusCode(200);
    }

    @Test
    public void verify_JSON_Message_Response_Body() {

        given().when().get("/").then()
                .body("message", equalTo("Welcome to the machine."))
                .body("timestamp", containsStringIgnoringCase("2021"))
                .log().all();
    }

}
