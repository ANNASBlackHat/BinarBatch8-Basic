import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        //Map : key value pair
        Map<String, String> data = new HashMap();
        data.put("1111", "data rahasia 1");
        data.put("abcd", "data rahasia 2");
        data.put("3abc", "data rahasia 3");

        System.out.println("Data 1111 : "+data.get("1111"));
        for (Map.Entry<String, String> map: data.entrySet()){
            System.out.println("Key : "+map.getKey());
            System.out.println("Value : "+map.getValue());
        }
    }
}
