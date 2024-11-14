package com.telran.lesson5;

public enum Season {

    WINTER("very snow", "December"),
    SPRING("green", "March"),
    SUMMER("sun", "June"),
    AUTUMN("rain", "September");

    private String description;

    private String startMonth;

    Season(String description, String startMonth) {
        this.description = description;
        this.startMonth = startMonth;
    }

    public String getDescription() {
        return description;
    }

    public String getStartMonth() {
        return startMonth;
    }
}
