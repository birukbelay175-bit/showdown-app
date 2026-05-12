package com.pluralsight;
public class ShowdownApp {
    public static void main(String[] args) {

        SuperHero hero = new SuperHero("Spider-Man", 100, 15);
        SuperVillain villain = new SuperVillain("Green Goblin", 100, 12);

        System.out.println(hero.getName() + " vs " + villain.getName());
        System.out.println("Battle begins!");

        while (hero.getHealth() > 0 && villain.getHealth() > 0) {
            hero.attack(villain);

            System.out.println(hero.getName() + " attacks " + villain.getName());
            System.out.println(villain.getName() + " health: " + villain.getHealth());

            villain.attack(hero);

            System.out.println(villain.getName() + " attacks " + hero.getName());
            System.out.println(hero.getName() + " health: " + hero.getHealth());
        }
    }
}
