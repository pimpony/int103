package List;


import java.util.Queue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Live-
 */
public class TestStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Add Element to Queue
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    
}
