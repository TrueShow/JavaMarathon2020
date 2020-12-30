package day7;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            players.add(new Player(90 + random.nextInt(11)));
        }
        Player.info();
        System.out.println("Игроков в поле: " + Player.getCountPlayers());

        System.out.println("Стамины у игрока 0: " + players.get(0).getStamina());


        for (int i = 0; i < 95; i++) {
            players.get(0).run();
        }
        System.out.println("Осталось выносливости: " + players.get(0).getStamina());
        System.out.println("Игроков в поле: " + Player.getCountPlayers());

    }
}
