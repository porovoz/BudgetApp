package com.port.budgetapp.model;

public enum Category {
    FOOD("Food"),
    CLOTHES("Clothes"),
    FUN("Fun"),
    TRANSPORT("Transport"),
    HOBBY("Hobby");

    private final String text;

    Category(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
