package practiceIt;

import java.util.ArrayList;

public class RemoveEvenLength {

    public static void main(String[] args) {
        ArrayList<String> newList= new ArrayList<>();
        newList.add("This");
        newList.add("is");
        newList.add("a");
        newList.add("test");
        removeEvenLength(newList);
        System.out.println(newList);
    }

    public static void removeEvenLength(ArrayList<String> list){
        for(int i=list.size()-1; i>=0; i--){
            int stringLength=list.get(i).length();
            if(stringLength%2==0){
                list.remove(list.get(i));
            }
        }

    }
}
