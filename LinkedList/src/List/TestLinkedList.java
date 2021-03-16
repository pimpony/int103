package List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Live-
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestLinkedList {

    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Apple");//1isautoboxedtonewInteger(1)
//        System.out.println(linkedList);
//        linkedList.add("Banana");
//        System.out.println(linkedList);
//        linkedList.add("Cherry");
//        System.out.println(linkedList);
//        linkedList.add("Mango");
//        System.out.println(linkedList);
//        linkedList.add("orange");
//        System.out.println(linkedList);
//        System.out.println("-------Add First And Add Last-------------");
//        linkedList.addFirst("grave");
//        System.out.println("First : " + linkedList);
//        linkedList.addLast("lemon");
//        System.out.println("Last : " + linkedList);
//        System.out.println("---------Show Fruit index 3-----------");
//        System.out.println(linkedList.get(3));
//        System.out.println("---------Add to index 3-----------");
//        linkedList.add(3, "avocado");
//        System.out.println(linkedList);
//        System.out.println("---------Add to index 2-----------");
//        linkedList.add(2, "Blueberry");
//        System.out.println(linkedList);
//        System.out.println("----------Remove index 1----------");
//        linkedList.remove(1);
//        System.out.println(linkedList);
//        System.out.println("---------Remove Mango-----------");
//        linkedList.remove("Mango");
//        System.out.println(linkedList);

        Queue<String> queue = new LinkedList<>();
        // Add Element to Queue

        queue.offer(
                "One");
        queue.offer(
                "Two");
        queue.offer(
                "Three");
        queue.offer(
                "Four");
        queue.offer(
                "Five");
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }

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
