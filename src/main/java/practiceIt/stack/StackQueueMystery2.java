package practiceIt.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StackQueueMystery2 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList(List.of(30, 20, 10, 60, 50, 40, 3, 0));
        mystery2(linkedList);

    }

    public static void mystery2(Queue<Integer> q){
        Stack<Integer> s =new Stack<>();
        int size=q.size();
        for (int i=0; i<size; i++) {
            int n=q.remove();
            if (n%2==0){
                s.push(n);
            }else {
                q.add(n);
            }
        }
        System.out.println(q+" "+s);
    }

    //size=6
    //i=0 1 2 3 4 5
    //n=1 -2 3 -4 5 -6
    //q=-1 -3 -5

}