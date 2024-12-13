package com.telran.summary5;

import com.telran.summary5.model.Product;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {

        System.out.println("Choose : 1 - Admin, 2 - User");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        switch (data){
            case 1 -> new AdminController().start();
            case 2 -> new UserController().start();
            default -> System.out.println("Bye!");
        }



    }
}
