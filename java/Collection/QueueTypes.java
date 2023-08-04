package Collection;

import java.util.*;

public class QueueTypes {

    public static void main(String[] args) {

        Queue<String> a = new PriorityQueue<>();
        Queue<String> b = new ArrayDeque<>();

        Deque<String> c = new ArrayDeque<>();

    //------------------------------------------
    //The retrieval order is the natural order.
        priorityQueue(a);
    //------------------------------------------
    //Stack structure could be represented by Deque interface and is implemented by ArrayDeque
    //Deque interface has utility methods to facilitate the use of the stack
        arrayDeque(b);
        arrayDeque(c);
    //ArrayDeque is not thread safe.
    //It's much faster than Stack class.
    //In the most cases ArrayDeque has better performance than LinkedList

    }

    private static void priorityQueue(Queue<String> stack) {
        stack.offer("Person z");
        stack.offer("Person d");
        stack.offer("Person c");
        System.out.println("[PriorityQueue] " + stack);
        System.out.println("[PriorityQueue] " + stack.peek());

        for (String i :stack) {
            System.out.println("[PriorityQueue][ITEM] " + i);
        }

        stack.poll();
        System.out.println("[Deque] " + stack);
    }

    private static void arrayDeque(Queue<String> stack) {
        stack.offer("First request");
        stack.offer("Second request");
        stack.offer("Third request");
        System.out.println("[ArrayDeque](1) " + stack);
        System.out.println("[ArrayDeque](1) " + stack.peek());

        stack.poll();
        System.out.println("[ArrayDeque](1) " + stack);
    }
    private static void arrayDeque(Deque<String> stack) {
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println("[ArrayDeque](2) " + stack);
        System.out.println("[ArrayDeque](2) " + stack.peek());

        stack.pop();
        System.out.println("[ArrayDeque](2) " + stack);

        stack.poll();
        System.out.println("[ArrayDeque](2) " + stack);

        //Only difference between pop and poll:
        //When we use pop without any element, it will throw a no such element exception.
        //When we use poll without any element, it will return null;

        stack.pop();

        if(stack.poll() == null){
            System.out.println("[ArrayDeque](2) " + "Pool returned null");

            try {
                System.out.println("[ArrayDeque](2) " + "Trying to pop the null stack");
                stack.pop();
            } catch (NoSuchElementException e) {
                System.out.println("[ArrayDeque](2) " + e);
            }
        }
    }

}
