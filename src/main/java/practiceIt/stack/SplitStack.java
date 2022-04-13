package practiceIt.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(5);
        stack.push(-10);
        stack.push(15);
        stack.push(0);
        stack.push(-5);
        stack.push(100);

        splitStack(stack);

    }

    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int numNegatives = 0;

        while (!s.isEmpty()) {
            if (s.peek() < 0)
                numNegatives++;
            q.add(s.pop());
        }

        while (numNegatives > 0) {
            if (q.peek() < 0) {
                s.push(q.remove());
                numNegatives--;
            } else {
                q.add(q.remove());
            }
        }

        while (!q.isEmpty())
            s.push(q.remove());

        System.out.println(s);
    }

}
    //size=6
    //i=0 1 2 3 4 5
    //n=1 -2 3 -4 5 -6
    //q=-1 -3 -5

