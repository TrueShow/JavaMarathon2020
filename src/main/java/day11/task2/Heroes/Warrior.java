package day11.task2.Heroes;

import day11.task2.Interfaces.PhysAttack;

public class Warrior extends Hero{

    public Warrior() {
        this.physAtt = 30;
        this.physDef = 0.8f;
    }

    @Override
    public String toString() {
        return "Warrior {" +
                "health = " + health + "}";
    }
}
