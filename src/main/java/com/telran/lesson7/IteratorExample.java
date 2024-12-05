package com.telran.lesson7;


public class IteratorExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();
        // -> A B C D E
        String next = iterator.next(); //A
        // A -> B C D E
        String next1 = iterator.next(); //B
        // A B -> C D E
        String next2 = iterator.next(); //C
        //A B C -> D E
        String next3 = iterator.next(); //D
        //A B C D - > E
        String next4 = iterator.next(); //E
        //A B C D E - >
        System.out.println(next + " " + next1 + " " + next2 + " " + next3 + " " + next4);

        Iterator<String> iteratorTwo = strings.iterator();
        while (iteratorTwo.hasNext()) {
            String value = iteratorTwo.next();
            System.out.print( value + " ");
        }
        System.out.println();

    }

    private static void printElements(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String value = iterator.next();
        }
    }
}
