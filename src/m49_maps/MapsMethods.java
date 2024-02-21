package m49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapsMethods {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name","Arthur");
        map.put("gender","Male");
        map.put("age",31);
        map.putIfAbsent("job_title","Software");


        System.out.println(map);
        System.out.println(map.size());

        //map.clear();
        map.remove("name","Arthur");
        System.out.println(map);

    }
}
