package practiceIt.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueueUsage1 {

    public static void main(String[] args) {

        Stack<String> s=new Stack<>();
        Queue<String> q=new LinkedList<>();

        s.push("how");
        s.push("are");
        s.push("you");
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);

    }




}