package ru.job4j.order.ru.tests.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Dog {
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int height;
    private double weight;
    private String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.setHeight(40);
        dog2.setHeight(60);
        dog3.setHeight(55);
        dog1.setWeight(12.5);
        dog2.setWeight(20.1);
        dog3.setWeight(25.5);
        dog1.setName("Puppy");
        dog2.setName("Mr Jenkins");
        dog3.setName("Rubby");
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.sort(Comparator.comparingInt(dogs2 -> dogs2.height));
        Supplier<Dog> sup = () -> new Dog();
        dogs.add(sup.get());
    }
}
