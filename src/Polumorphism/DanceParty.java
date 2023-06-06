package Polumorphism;

import java.util.ArrayList;

public class DanceParty {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[4] = new Animal();

        for (Animal animal: animals){
            animal.dance();
        }

        Object something = "String";

        something = new ArrayList<Animal>();

        something = true;

        something = 50.3;

        Animal dog = new Dog();

        Dog rot = (Dog) dog;

    }

    public static void dance (Animal animal){

    }
}
