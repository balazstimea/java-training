package practiceIt.maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMystery3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new TreeMap<>();
        map1.put("bar", "1");
        map1.put("baz", "2");
        map1.put("foo", "3");
        map1.put("mumble", "4");

        Map<String, String> map2 = new TreeMap<>();
        map2.put("1", "earth");
        map2.put("2", "wind");
        map2.put("3", "air");
        map2.put("4", "fire");

        System.out.println(mystery(map1, map2));

    }

    public static Map<String, String> mystery(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> result = new TreeMap<String, String>();

        for (String s1 : map1.keySet()) {
            if (map2.containsKey(map1.get(s1))){
                result.put(s1, map2.get(map1.get(s1)));
            }

        }
        return result;
    }
}
