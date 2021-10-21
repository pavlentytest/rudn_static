package ru.samsung.itschool.mdev;

public class Animal {
    private String name;
    public static int legs = 4;
    public static final int ABC = 123;

    Animal() {

    }

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public static void makeSound() {
        System.out.println("bu!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
