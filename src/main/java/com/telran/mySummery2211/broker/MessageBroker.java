package com.telran.mySummery2211.broker;

import java.util.ArrayList;
import java.util.List;

public class MessageBroker {

    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(0, message);
    }

    public Message getMessage() {
        Message message = messages.get(messages.size() - 1);
        messages.remove(message);
        return message;
    }

    public boolean isEmpty() {
        return messages.isEmpty();
    }
}
