package practiceIt.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CopyStack{

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(5);
        stack.push(-10);
        stack.push(15);
        stack.push(0);
        stack.push(-5);
        stack.push(100);

        copyStack(stack);

    }

    public static void copyStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> snew=new Stack<>();

        while(!s.isEmpty()){
            int n=s.pop();
            q.add(n);

        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            int n=s.pop();
            q.add(n);

        }
        while(!q.isEmpty()){
            snew.push(q.remove());
        }

        System.out.println(snew);

    }

    // s 2 3 4 5
    // q 5 4 3 2 1
    // 4 5

}


