package com.telran.mylesson5;

public class SeasonApp {
    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.print(season + ", that starts in " + season.getStartMonth() + " is ");
            System.out.println(season.getDescription());
        }
    }
}
