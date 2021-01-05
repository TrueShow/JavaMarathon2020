package day11.task2.Heroes;

import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int health;
    private float physDef;
    private float magicDef;
    private int physAttack;
    private int magicAttack;

    public Magician() {
        health = 100;
        physDef = 0.0f;
        magicDef = 0.8f;
        physAttack = 5;
        magicAttack = 20;
    }

    public void takeDamage(int amount, float def) {
        health -= amount - (amount * def);
        if (health <= 0) {
            health = 0;
        }
    }

    @Override
    public float getPhysDef() {
        return physDef;
    }

    @Override
    public float getMagicDef() {
        return magicDef;
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
    public void magicalAttack(Hero hero) {
        hero.takeDamage(magicAttack, hero.getMagicDef());
        System.out.println(hero);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.takeDamage(physAttack, hero.getPhysDef());
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Magician {" +
                "health = " + getHealth() + "}";
    }
}
