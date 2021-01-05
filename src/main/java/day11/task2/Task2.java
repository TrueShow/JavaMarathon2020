package day11.task2;

import day11.task2.Heroes.Magician;
import day11.task2.Heroes.Paladin;
import day11.task2.Heroes.Shaman;
import day11.task2.Heroes.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
        }

    }
}
