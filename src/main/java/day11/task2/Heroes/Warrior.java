package day11.task2.Heroes;

import day11.task2.Interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {
    private int health;
    private float physDef;
    private float magicDef;
    private int physAttack;
    private int magicAttack;

    public Warrior() {
        health = 100;
        physDef = 0.8f;
        magicDef = 0.0f;
        physAttack = 30;
        magicAttack = 0;
    }

    @Override
    public float getPhysDef() {
        return physDef;
    }

    @Override
    public float getMagicDef() {
        return magicDef;
    }

    public void takeDamage(int amount, float def) {
        if (health <= 0) {
            health = 0;
        }
        health -= amount - (amount * def);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void heal(int amount) {
        health += amount;
        if (health >= 100) {
            health = 100;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.takeDamage(physAttack, hero.getPhysDef());
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Warrior {" +
                "health = " + getHealth() + "}";
    }
}
