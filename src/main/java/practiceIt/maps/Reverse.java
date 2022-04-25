package practiceIt.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Reverse {
    public static void main(String[] args) {
        Map<Integer, String> map= new TreeMap<>();
        map.put(42, "Marty");
        map.put(81, "Sue");
        map.put(17, "Ed");
        map.put(31, "Dave");
        map.put(56, "Ed");
        map.put(3, "Marty");
        map.put(29, "Ed");

        System.out.println(reverse(map));
    }
    public static Map<String, Integer> reverse(Map<Integer, String> map){
        Map<String, Integer> result = new HashMap<>();

        for(Integer key: map.keySet()){
                result.put(map.get(key), key);
            }
        return result;
        }

}
