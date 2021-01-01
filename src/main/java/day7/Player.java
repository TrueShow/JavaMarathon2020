package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        if (this.stamina < 0) {
            return this.stamina = 0;
        }
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;

        if (stamina == 0) {
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
