package practiceIt.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stutter {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(5);
        stack.push(-10);
        stack.push(15);
        stack.push(0);
        stack.push(-5);
        stack.push(100);

        stutter(stack);

    }

    public static void stutter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();

        while(!s.isEmpty()){
            int n=s.pop();
            q.add(n);
            q.add(n);
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            int t = s.pop();
            q.add(t);
        }
        System.out.println(q);
    }
}
    //size=6
    //i=0 1 2 3 4 5
    //n=1 -2 3 -4 5 -6
    //q=-1 -3 -5

