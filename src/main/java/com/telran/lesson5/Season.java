package com.telran.lesson5;

public enum Season {

    WINTER("very snov", "1"),
    SPRING("Green", "4"),
    SUMMER("sun","8"),
    AUTUMN("rain", "12");

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
