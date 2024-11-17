package com.telran.mylesson5;

public enum Season {

    WINTER("snowy season", "December"),
    SPRING("rainy season", "March"),
    SUMMER("sunny season", "June"),
    AUTUMN("bright season", "September");

    private String description;

    private String startMonth;

    Season(String description, String startMonth) {
        this.description = description;
        this.startMonth = startMonth;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public String getDescription() {
        return description;
    }
}
