package Collection;

import java.util.*;

public class ListTypes {
    public static void main(String[] args) {

        List<String> a = new ArrayList();
        List<String> b = new LinkedList();
        List<String> c = new Vector();
        List<String> d = new Stack();

        //They share the same Interface (List)

    //------------------------------------------
        //LinkedLists are quite quick at adding and removing elements
        //Quicker than ArrayList
        //And is slow to iterate, since the logic is based in linking elements to search.

        //Each element has the reference to the last and previous element. They are linked.

        //OBS: In a big list, ArrayList could be the better option.
        //By default, isn't thread safe.
        linkedList(b);
        linkedListThreadSafe(b);

    //------------------------------------------
        //Stack is synchronized (Thread safe)

        stack(d);

    }

    private static void stack(List stack) {
        stack.add("First request");
        stack.add("Second request");
        stack.add("Third request");
        System.out.println("[Stack] " + stack);

    }

    private static void linkedListThreadSafe(List b) {
        List bCopy = Collections.synchronizedList(b); //make a copy of the list, but synchronized.
        // now, bCopy is thread safe
    }

    private static void linkedList(List<String> b) {
        b.add("1");
        b.add("1");
        b.add("1");
        System.out.println("[LinkedList] " + b);

        b.add(1,"0");
        System.out.println("[LinkedList] " + b);

        ((LinkedList<String>) b).removeFirst();
        System.out.println("[LinkedList] " + b);
    }


}
