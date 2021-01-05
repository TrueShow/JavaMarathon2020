package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.PhysAttack;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {
    private int health;
    private float physDef;
    private float magicDef;
    private int physAttack;
    private int magicAttack;

    private final int healSelf = 50;
    private final int healTeammate = 30;

    public Shaman() {
        health = 100;
        physDef = 0.2f;
        magicDef = 0.2f;
        physAttack = 10;
        magicAttack = 15;
    }


    public void takeDamage(int amount, float def) {
        if (health <= 0) {
            health = 0;
        }
        health -= amount - (amount * def);
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
    public void healHimself() {
        if (health < 100) {
            this.health += healSelf;
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
        return "Shaman {" +
                "health = " + getHealth() + "}";
    }
}
