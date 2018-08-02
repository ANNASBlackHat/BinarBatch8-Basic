package poly;

public class SMSSender extends MessageSender {

    public SMSSender(String sender, String receipt, String messsageContent) {
        super(sender, receipt, messsageContent);
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message from : "+getSender()+", " +
                "\nTo : "+getReceipt()+"" +
                "\nMessage : "+getMesssageContent()+
                "\n>> Using SMS!\n\n");
    }
}
