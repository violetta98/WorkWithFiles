package OverridingEqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Main2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Pasha");
        map.put("1", "Anna");
        map.put("1", "Ivan");
        map.put("2", "Ivan");
        System.out.println(map);
    }

}
