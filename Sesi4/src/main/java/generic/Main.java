package generic;

import com.google.gson.Gson;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Integer[] data = {1,3,5,7};
////        tampilInt(data);
////
////        String[] dataStr = {"1","2","4"};
////        tampilAll(data);

        new APIManager().getBook();
    }

    static <T> void tampilAll(T[] data){

    }

    static void tampilInt(Integer[] data){
        //..looping
    }
}
