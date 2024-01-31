package main;

import java.util.ArrayList;

public class Zoo {
    private String zooName;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String zooName) {
        this.zooName = zooName; 
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        System.out.println(zooName + " pitää sisällään seuraavat eläimet:");
        for (Animal animal : animals) {
            System.out.println(animal.getSpecies() + ": " + animal.getName() + ", " + animal.getAge() + " vuotta");
        }
    }
    
    public void runAnimals(int rounds) {
        for (Animal animal : animals) {
            for (int i = 0; i < rounds; i++) {
                System.out.println(animal.getName() + " juoksee kovaa vauhtia!");
           
        }
    }
    // public void setName(String name) {
        // this.name = name;
    // }

    // public String getName() {
       //  return name;
    // }

    }
}


