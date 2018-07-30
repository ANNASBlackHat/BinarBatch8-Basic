package mvp;

public class MyActivity implements MyInterfaces {

    void onCreate(){
        MyPresenter presenter = new MyPresenter(this);
        presenter.getDataFromServer();
    }

    @Override
    public void onProcessFinish(String result) {

    }
}
