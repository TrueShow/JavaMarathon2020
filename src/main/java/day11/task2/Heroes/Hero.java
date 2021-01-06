package day11.task2.Heroes;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;

    int health;
    float physDef;
    float magicDef;
    int physAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physAttack(Hero hero) {
        float attackScore = physAtt - physAtt * hero.physDef;
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
