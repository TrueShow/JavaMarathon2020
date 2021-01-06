package day11.task2.Heroes;


import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt;

    private static final int HEAL_SELF = 50;
    private static final int HEAL_TEAM = 30;

    public Shaman() {
        this.magicAtt = 15;
        this.magicDef = 0.2f;
        this.physDef = 0.2f;
        this.physAtt = 10;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_SELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_SELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAM > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAM;
        }
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
        return "Shaman {" +
                "health = " + health + "}";
    }


}
