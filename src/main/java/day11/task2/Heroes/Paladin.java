package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer {
    private float physDef;
    private float magicDef;
    private int physAttack;
    private int magicAttack;
    private int health;

    private final int healSelf = 25;
    private final int healTeammate = 10;

    public Paladin() {
        health = 100;
        physDef = 0.5f;
        magicDef = 0.2f;
        physAttack = 15;
        magicAttack = 0;
    }

    @Override
    public float getPhysDef() {
        return physDef;
    }

    public void takeDamage(int amount, float def) {
        if (health <= 0) {
            health = 0;
        }
        health -= amount - (amount * def);
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
    public void physicalAttack(Hero hero) {
        hero.takeDamage(physAttack, hero.getPhysDef());
        System.out.println(hero);
    }

    @Override
    public void healHimself() {
        if (health < 100) {
            health += healSelf;
        }
        if (health >= 100) {
            health = 100;
        }
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.heal(healTeammate);
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Paladin {" +
                "health = " + getHealth() + "}";
    }
}
