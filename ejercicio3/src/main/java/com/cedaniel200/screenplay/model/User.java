package com.cedaniel200.screenplay.model;

public class User {
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String name() {
        return username;
    }

    public String password() {
        return password;
    }
}
