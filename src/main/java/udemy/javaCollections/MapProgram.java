package udemy.javaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages=new HashMap<>();
        if (languages.containsKey("Java")){
            System.out.println("Java is already exists");
        } else {
            languages.put("Java", "a compiled high level, object oriented, platform independent language");
            System.out.println("Java added successfully");
        }


        languages.put("Python", "an independent, object oriented, high level performing language");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=======================================================");

        //removing methods from maps
        //languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        for (String key: languages.keySet()){
            System.out.println(key + " : "+ languages.get(key));
        }
    }
}
