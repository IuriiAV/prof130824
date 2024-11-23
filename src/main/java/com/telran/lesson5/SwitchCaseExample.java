package com.telran.lesson5;

public class SwitchCaseExample {

    public static void main(String[] args) {



    }

    private static void dayIsNice(Days day){

        switch (day){

            case MONDAY:
                System.out.println("Bad day");
                break;
            case FRIDAY:
                System.out.println("Funny day");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Best day");
                break;
            default:
        }
    }
}
