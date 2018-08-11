package main;


import animals.*;

import java.util.*;


public class Main {

    static Animal animal1;
    static Animal animal2;
    static Animal animal3;
    static Animal animal4;
    static Animal animal5;
    static Animal animal6;
    static Animal animal7;
    static Animal animal8;
    static Animal animal9;
    static Animal animal10;


    public static void main(String[] args){

        animal1 = new Cat("Cat","Bob", 10,"Meow!", true, 15);
        animal2 = new Dog("Dog","George", 5, "Aw!", true, 16);
        animal3 = new Dinosaur("Dinosaur","Rex", 25, "Arghh!", false, 50);
        animal4 = new Cat("Cat","Lui", 19, "Meow!", true, 15);
        animal5 = new Cat("Cat","John", 12, "Meow!", true, 15);
        animal6 = new Dog("Dog","Bulya", 2, "Aw!", true, 16);
        animal7 = new Dinosaur("Dinosaur","Tirex", 19, "Arghh!", false, 50);
        animal8 = new Dog("Dog","Bone", 4, "Aw!", true, 16);
        animal9 = new Dog("Dog","Angel", 20, "Aw!", true, 16);
        animal10 = new Dinosaur("Dinosaur","Duplex", 40, "Arghh!", false, 50);



        List<Animal> list = new ArrayList();

        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);
        list.add(animal5);
        list.add(animal6);
        list.add(animal7);
        list.add(animal8);
        list.add(animal9);


        Collections.sort(list, new CompareByClassAndAge());

        for (Animal animal : list){
            System.out.println(animal);
        }










    }
}
