package com.shavonne.TakeHomeChallenge.Controller;

import com.shavonne.TakeHomeChallenge.Model.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

    @GetMapping("/")
    public JSON getJSONResponseBody() {
        final JSON json = new JSON();
        json.setMessage("Welcome to the machine.");
        json.getTimestamp();
        return json;
    }
}
