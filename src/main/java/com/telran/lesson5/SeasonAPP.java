package com.telran.lesson5;

public class SeasonAPP {
    public static void main(String[] args) {

        for (Season season : Season.values()){
            System.out.print(season + " : ");
            System.out.print(season.getDescription());
            System.out.println(season.getStartMonth());
        }



    }
}
