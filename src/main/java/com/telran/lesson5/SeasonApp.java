package com.telran.lesson5;

public class SeasonApp {

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.print(season + " : ");
            System.out.println(season.getDescription() + " " + season.getStartMonth() );
        }

        Season winter = Season.WINTER;
        System.out.println(winter.getDescription() + winter.getStartMonth());


    }
}
