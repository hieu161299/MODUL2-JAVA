package use_hashMap_LinkedListMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // Bước 2: Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String , Integer> newHashMap = new HashMap<>();
        newHashMap.put("Smith",30);
        newHashMap.put("Anderson",27);
        newHashMap.put("Lewis",16);
        newHashMap.put("Cook",19);
        System.out.println("Display entries in HashMap");
        System.out.println(newHashMap);

        //Bước 3: Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> newTreeMap = new TreeMap<>(newHashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(newTreeMap);

        //Bước 4: Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu

        Map<String , Integer> newLinkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        newLinkedHashMap.put("Smith", 30);
        newLinkedHashMap.put("Anderson", 31);
        newLinkedHashMap.put("Lewis", 29);
        newLinkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + newLinkedHashMap.get("Lewis"));
    }
}
