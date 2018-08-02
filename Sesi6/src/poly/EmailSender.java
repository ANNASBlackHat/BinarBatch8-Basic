package poly;

public class EmailSender extends MessageSender{
    private String subject;

    public EmailSender(String sender, String receipt, String messsageContent, String subject) {
        super(sender, receipt, messsageContent);
        this.subject = subject;
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message from : "+getSender()+", " +
                "\nTo : "+getReceipt()+"" +
                "\nMessage : "+getMesssageContent()+
                "\nSubject : "+subject+
                "\n>> Using EMAIL!\n\n");
    }
}
