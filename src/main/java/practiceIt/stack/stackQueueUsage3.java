package practiceIt.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueueUsage3 {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q.peek());
        q.add(6);
        System.out.println(q.remove());
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.add(7);
        System.out.println(q.peek());

        System.out.println(q);

        //size = 6
        // i= 1 2 3 4 5
        //n= 1 2 3 4 5 6
        //q= 1, 3, 5
        //s= 6 4 2


    }

}