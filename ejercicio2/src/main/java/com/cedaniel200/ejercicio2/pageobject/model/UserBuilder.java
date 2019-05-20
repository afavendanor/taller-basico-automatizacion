package com.cedaniel200.ejercicio2.pageobject.model;

public class UserBuilder {
    private String username;
    private String password;

    private UserBuilder() {
        username = "cesar@email.com";
        password = "123456";
    }

    public static UserBuilder createUser(){
        return new UserBuilder();
    }

    public static User getUserByDefault(){
        return createUser().build();
    }

    public UserBuilder withUsername(String username) {
        this.username= username;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public User build(){
        return new User(this.username, this.password);
    }
}
