package test_collection;

import java.util.HashMap;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String , Integer> customers = new HashMap<>();
        customers.put("jax",30);
        customers.put("zac",48);
        customers.put("ga",19);
        customers.put("tun",13);

        Set<String> keys = customers.keySet(); // Set trong java là một Collection không thể chứa các phần tử trùng lặp.
        for (String key: keys) {
            System.out.println( key + ": " + customers.get(key) );
        }
        System.out.println(keys);

        System.out.println(customers.get("jax")); // trả về value ở ô có name = jax
    }
}
