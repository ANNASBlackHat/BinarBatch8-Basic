public class DataProcess {
    static String name;

    String result;

    public String process(String data, DataListener listener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                //write code to calculte something... 50 lines code

                //send data to server
                //.....
                try {
                    Thread.sleep(5000);//delay
                } catch (InterruptedException e) { }

                String resultFromServer = "example...";
                listener.onProcessFinish(resultFromServer);
                result = resultFromServer;
            }
        }).start();

        return result;
    }
}
