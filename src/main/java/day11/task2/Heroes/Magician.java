package day11.task2.Heroes;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {
    int magicAtt;

    public Magician() {
        this.magicAtt = 20;
        this.physAtt = 5;
        this.magicDef = 0.8f;
        this.physDef = 0.0f;
    }

    @Override
    public void magicalAttack(Hero hero) {
        float attackScore = magicAtt - magicAtt * hero.magicDef;
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Magician {" +
                "health = " + health + "}";
    }
}
