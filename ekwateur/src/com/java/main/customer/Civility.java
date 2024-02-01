package com.java.main.customer;

public enum Civility {
    MR("Mr"),
    MRS("Mrs");

    private final String name;

    Civility(String name) {
        this.name = name;
    }
}
