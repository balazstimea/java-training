package practiceIt;

import java.util.ArrayList;


public class Mystery2 {

    public static void main(String[] args){
        ArrayList<Integer> newList= new ArrayList<Integer>();
        newList.add(-1);
        newList.add(3);
        newList.add(28);
        newList.add(17);
        newList.add(9);
        newList.add(33);
        mystery2(newList);
        System.out.println(newList);
        }

    public static void mystery2(ArrayList<Integer> list){
        for (int i=list.size()-1; i>=0;i--) {
            if(i%2==0){
                list.add(list.get(i));
            } else {
                list.add(0, list.get(i));
            }
        }
        System.out.println(list);
    }
}
