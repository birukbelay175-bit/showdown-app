package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {

        SuperHero hero = new SuperHero("Spider-Man", 100, 15);
        SuperVillain villain = new SuperVillain("Green Goblin", 100, 12);

        System.out.println(hero.getName() + " vs " + villain.getName());
        System.out.println("Battle begins!");
    }
}
