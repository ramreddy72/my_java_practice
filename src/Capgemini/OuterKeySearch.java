package Capgemini;

import java.util.HashMap;
import java.util.Map;

public class OuterKeySearch {
    public static void main(String[] args) {
        // Sample Map<String, Map<String, String>>
        Map<String, Map<String, String>> records = new HashMap<>();
        Map<String, String> record1 = new HashMap<>();
        record1.put("key1", "value1");
        record1.put("key2", "value2");
        record1.put("key3", "value3");

        Map<String, String> record2 = new HashMap<>();
        record2.put("key1", "value1");
        record2.put("key2", "value2");
        record2.put("key3", "value3");

        records.put("record1", record1);
        records.put("swecha01", record2);

        // Specific input to match the starting of outer keys
        // String specificInput = "rec";

        // Loop through the outer map to find keys starting with specific input
        // for (String outerKey : records.keySet()) {
        //     if (outerKey.startsWith(specificInput)) {
        //         System.out.println("Matching outer key: " + outerKey);
        //     }
        // }
        System.out.println(records.get("swecha"));
    }
}
