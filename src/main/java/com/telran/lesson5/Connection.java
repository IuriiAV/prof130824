package com.telran.lesson5;

public enum Connection {

    TESTCONN1("google.com", "admin", "1234"),
    TESTCONN2("amazon.com", "admin", "1234");


    private String url;

    private String user;

    private String password;

    Connection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
}
