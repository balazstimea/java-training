package practiceIt.maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMystery1 {
    public static void main(String[] args) {
        Map<String, String> map= new TreeMap<>();
        map.put("two", "deux");
        map.put("five", "cinq");
        map.put("one", "un");
        map.put("three", "trois");
        map.put("four", "quatre");

        //{skate=board, drive=car, program=computer, play=computer}
        Map<String, String> map1= new TreeMap<>();
        map1.put("skate", "board");
        map1.put("drive", "car");
        map1.put("program", "computer");
        map1.put("play", "computer");


        mapMystery1(map);
        mapMystery1(map1);

    }
    public static void mapMystery1(Map<String, String> map){
        Map<String, String> result = new TreeMap<String, String>();

        for(String key: map.keySet()){
            if (key.compareTo(map.get(key))<0){
                result.put(key, map.get(key));
            }else{
                result.put(map.get(key), key);
            }
        }
        System.out.println(result);
    }
}
