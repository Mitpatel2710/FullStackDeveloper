package org.studyeasy;

import animal.Animal;
import animal.bird.Eagle;
import animal.fish.Eel;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
/*
        Animal animal = new Animal();
        System.out.println(animal.ShowInfo());

        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());

        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
 */

        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Animal reptile = new Reptile();
        Animal crocodile = new Crocodile();
        Animal eel = new Eel();
        Animal eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(crocodile);
        animals.add(eel);
        animals.add(eagle);
        ListAnimals(animals);
    }

    public static void ListAnimals(List<Animal> animals) {
        for (Animal animal: animals){
            System.out.println(animal.showInfo());

        }
    }
}
