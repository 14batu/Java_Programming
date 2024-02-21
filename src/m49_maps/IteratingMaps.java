package m49_maps;

import java.util.HashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name","Arthur");
        map.put("gender","Male");
        map.put("age",31);
        map.putIfAbsent("job_title","Software");
        map.putIfAbsent("salary",140000.0);
        map.putIfAbsent("full_time",true);

        for (String eacKey : map.keySet()){
            System.out.println(eacKey + ": " + map.get(eacKey));
        }

        System.out.println("-----------------------------------------------------------");

        for (Object value : map.values()) {
            System.out.println(value);
        }
        System.out.println("-----------------------------------------------------------");
        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {

        }
    }
}
