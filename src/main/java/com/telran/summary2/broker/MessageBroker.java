package com.telran.summary2.broker;

import java.util.ArrayList;
import java.util.List;

public class MessageBroker {

   private List<Messege> messeges = new ArrayList<>();

    public void addMessage(Messege messege){
        messeges.add(0, messege);
    }

    public Messege getMessage(){
        Messege messege = messeges.get(messeges.size()-1);
        messeges.remove(messege);
        return messege;
    }

    public boolean isEmpty(){
        return messeges.isEmpty();
    }
}
