package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (int i = 0; i < messages.size(); i++) {
            if (getMessages().get(i).getSender().equals(u1) && getMessages().get(i).getReceiver().equals(u2) || getMessages().get(i).getSender().equals(u2) && getMessages().get(i).getReceiver().equals(u1)) {
                System.out.println(getMessages().get(i).getSender().getUserName() + ": "
                       + getMessages().get(i).getText());
            }

        }
    }
}

