package com.pluralsight;

public class Person {

    private String name;
    private int health;
    private int power;

    public Person(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Person opponent) {
        opponent.setHealth(opponent.getHealth() - power);
    }
}