package practiceIt.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueueUsage2 {

    public static void main(String[] args) {

        Stack s=new Stack<Integer>();
        s.push(7);
        s.push(10);
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(3);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.peek());
        s.push(8);
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s);
    }

}