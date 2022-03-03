package practiceIt;

import java.util.ArrayList;

public class Stutter {

    public static void main(String[] args) {
        ArrayList<String> newestList= new ArrayList<>();
        newestList.add("This");
        newestList.add("is");
        newestList.add("a");
        newestList.add("test");
        stutter(newestList, 3);
        System.out.println(newestList);
    }


    public static void stutter (ArrayList<String> list, int k){
        ArrayList<String> newList = new ArrayList<>();
        if (k>0){
            for(int i=0; i<list.size(); i++){
                for(int j=0; j<k; j++){
                    newList.add(list.get(i));
                }
            }
        }
            list.clear();
            list.addAll(newList);
    }
}
