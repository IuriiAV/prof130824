package com.telran.lesson2;

public class DogApp {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Barsik");
        System.out.println("Dog dog name " + dog.getName());
        dog.voice();

        SmallDog smallDog = new SmallDog();
        smallDog.setName("Puppy");
        String name = smallDog.getName();
        System.out.println("Small dog name " + smallDog.getName());
        smallDog.voice();
        smallDog.jump();

        BigDog bigDog = new BigDog();
        bigDog.setName("Dog");
        System.out.println("Big dog name " + bigDog.getName());
        bigDog.voice();
        bigDog.bigVoice();
        bigDog.setAge(15);

        System.out.println("\nVoice in array :");
        //Dog, SmallDog, BigDog
        //наследников можно помещать в массив под родительским типом!!!
        Dog[] dogs = {dog, smallDog, bigDog};
        for(int i = 0; i < dogs.length; i++) {
            Dog tempDog = dogs[i];
            tempDog.voice();
            tempDog.run();
        }
    }
}
