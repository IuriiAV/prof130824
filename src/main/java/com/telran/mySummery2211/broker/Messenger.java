package com.telran.mySummery2211.broker;

import java.util.ArrayList;
import java.util.List;

public class Messenger {

    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            messages.add(new Message("text " + i));
        }

        int currentIndex = 0;
        int countAdd = 0;
        int countRemove = 0;
        MessageBroker broker = new MessageBroker();

        while (true) {
            if (countAdd < 5) {
                broker.addMessage(messages.get(currentIndex++));
            }
            if (broker.isEmpty()) {
                break;
            }
            if (countAdd % 5 == 0 && currentIndex < messages.size()) {
                broker.addMessage(messages.get(currentIndex++));
            }
            countAdd++;
            if (countRemove % 10 == 0) {
                System.out.println(broker.getMessage());
            }
            countRemove++;
        }
    }
}
