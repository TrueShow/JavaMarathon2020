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

        warrior.physAttack(paladin);
        System.out.println(paladin);

        paladin.physAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physAttack(magician);
            System.out.println(magician);
        }

    }
}
