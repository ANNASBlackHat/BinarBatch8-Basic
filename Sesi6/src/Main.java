import java.awt.*;
public class Main {

    public static void main(String[] args) {
         buyProduct("...", Payment.DOKU);

    }

    enum Payment {
        ALFAMART("001"), CREDIT_CARD("002"), DOKU("005");

        String id;
        Payment(String id) {
            this.id = id;
        }
    }

    static void buyProduct(String dataProduk, Payment paymentId){
        //api.bukalapak.com/buy/{data_product}/{payment_id}
        String id = "";
//        if(paymentId.equals("ALFAMART")){
//            id = "001";
//        }else if(paymentId.equals("CREDIT CARD")){
//            id = "002";
//        }
//        if(paymentId == Payment.ALFAMART){
//
//        }

        String url = "api.bukalapak.com/buy/"+dataProduk+"/"+paymentId.id;
    }
}
