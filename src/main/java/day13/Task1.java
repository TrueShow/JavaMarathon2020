package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Petr");
        User user3 = new User("Sveta");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как твои дела?");
        user2.sendMessage(user1, "Дарова!");
        user2.sendMessage(user1, "Ну такое себе, если честно");
        user2.sendMessage(user1, "Меня ограбили недавно в аэропорту!");
        user3.sendMessage(user1, "Эй, здаров!");
        user3.sendMessage(user1, "Ты тут?!");
        user3.sendMessage(user1, "Не молчи!!!");
        user1.sendMessage(user3, "Вчера было солнце");
        user1.sendMessage(user3, "А где был ты?");
        user1.sendMessage(user3, "Когда было темно");
        user3.sendMessage(user1, "Темно!");

        MessageDatabase.showDialog(user1,user3);
    }
}
