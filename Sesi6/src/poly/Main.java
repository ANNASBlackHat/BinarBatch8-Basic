package poly;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MessageSender> list = new ArrayList<>();
        list.add(new EmailSender("Ani", "Budi", "Hey", "sbj..."));
        list.add(new SMSSender("Feni", "Ari", "Hey"));
        list.add(new MessageSender("Fahmi", "Zakky", "Hey"));

        for (MessageSender messageSender: list){
            messageSender.sendMessage();
        }
    }
}
