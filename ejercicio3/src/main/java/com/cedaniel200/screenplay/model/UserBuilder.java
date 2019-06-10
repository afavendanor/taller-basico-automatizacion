package com.cedaniel200.screenplay.model;

public class UserBuilder {

    private String username;
    private String password;

    private UserBuilder() {
        this.username = "cesar@email.com";
        this.password = "123456";
    }

    public static UserBuilder user(){
        return new UserBuilder();
    }

    public static User userDefault(){
        return new UserBuilder().build();
    }

    public UserBuilder withUsername(String username){
        this.username = username;
        return this;
    }

    public User andPassword(String password){
        this.password = password;
        return build();
    }

    private User build(){
        return new User(username, password);
    }
}
