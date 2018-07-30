import java.util.List;

public interface DataListener {
    void onProcessFinish(String result);
    default void doSomething(){ }
}
