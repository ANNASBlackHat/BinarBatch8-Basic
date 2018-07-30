package mvp;

public class MyPresenter {
    private MyInterfaces listener;

    MyPresenter(MyInterfaces listener){
        this.listener = listener;
    }

    void getDataFromServer(){
        listener.onProcessFinish("");
    }
}
