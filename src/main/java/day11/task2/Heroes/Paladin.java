package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {
    private static final int HEAL_SELF = 25;
    private static final int HEAL_TEAM = 15;

    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5f;
        this.magicDef = 0.2f;
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
    public String toString() {
        return "Paladin {" +
                "health = " + health + "}";
    }
}
