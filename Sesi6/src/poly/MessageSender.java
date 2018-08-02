package poly;

public class MessageSender {
    private String sender; //pengirim pesan
    private String receipt; //penerima pesan
    private String messsageContent; //isi pesan


    public MessageSender(String sender, String receipt, String messsageContent) {
        this.sender = sender;
        this.receipt = receipt;
        this.messsageContent = messsageContent;
    }

    public void sendMessage(){
        System.out.println("Send message from : "+sender+", " +
                "\nTo : "+receipt+"" +
                "\nMessage : "+messsageContent+
                "\n>> Using default sender!\n\n");
    }

    public String getSender() {
        return sender;
    }

    public String getReceipt() {
        return receipt;
    }

    public String getMesssageContent() {
        return messsageContent;
    }
}
