package com.telran.summary2.broker;

import java.util.ArrayList;
import java.util.List;

/**ArrayList
 * 0 ....... n
 * ------>>>>
 * 2 3 3 7 4 5
 *
 * List 100 messages (reserve)
 *
 * List broker
 *
 * while
 * every 5 iterations add new message from reserve to broker
 * every 10 iterations get old message from broker
 *
 */
public class Messenger {

    public static void main(String[] args) {

        List<Messege> messeges = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            messeges.add(new Messege("Text " + i));
        }

        int currentIndex = 0;
        int countAdd = 0;
        int countRemove = 0;

        MessageBroker broker = new MessageBroker();

        while (true){
            if(countAdd < 5 ){
                broker.addMessage(messeges.get(currentIndex++));
            }
            if (broker.isEmpty()){
                break;
            }
            if (countAdd % 5 == 0 && currentIndex < messeges.size()){
                broker.addMessage(messeges.get(currentIndex++));
            }
            countAdd++;
            if (countRemove % 10 == 0){
                System.out.println(broker.getMessage());
            }
            countRemove++;
        }
    }
}
