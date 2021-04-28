package com.shavonne.TakeHomeChallenge.Model;

import java.sql.Timestamp;

public class JSON {

    private String message;
    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
