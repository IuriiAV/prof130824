package com.telran.myLesson22.stratagy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageApp {

    public static void main(String[] args) throws IOException {
        System.out.println("input message: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        System.out.println("select a send method: 1 - Email, 2 - Sms");
        int data = Integer.parseInt(reader.readLine());
        SendStrategy sendStrategy = null;

        switch (data) {
            case 1 -> sendStrategy = new EmailSendStrategy();
            case 2 -> sendStrategy = new SmsSendStrategy();
        }

        sendStrategy.send(message);
    }
}
