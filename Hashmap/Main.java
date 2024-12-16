package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Pho","Bun Cha"));
        ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(30000,45000));
        // HashMap: món ăn : key - giá tiền: value
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Pho", 30000);
        hashMap.put("Bun Cha", 45000);
        hashMap.put("Bun dau", 65000);

        System.out.println(hashMap);

    }
}
