package animal;

import pocket.Pocket;
import practice.Color;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Speedo",2,Gender.M,"shepard",9, Color.BROWN);
        dog.setAge(0);
        dog.setWeight(0);
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        System.out.println();





    }
}