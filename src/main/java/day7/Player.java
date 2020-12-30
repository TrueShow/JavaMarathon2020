package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA;
    private final int MIN_STAMINA;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        this.MAX_STAMINA = 100;
        this.MIN_STAMINA = 0;
        if (countPlayers >= 6) {
            countPlayers = 6;
        } else {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        this.stamina--;
        if (this.stamina < MIN_STAMINA) {
            this.stamina = 0;
        }
        else if (this.stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        int count = (6 - countPlayers);
        String place = null;
        // тут мало вариантов, можно не заниматься остатками и тд
        if (count == 1) {
            place = "свободное место";
        }
        else if (count >= 2 && count < 5) {
            place = "свободных места";
        }
        else if (count >= 5) {
            place = "свободных мест";
        }
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + count + " " + place);
        }
        else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        }
    }
}
