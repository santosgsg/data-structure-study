package Collection;

import java.util.*;

public class ListTypes {
    public static void main(String[] args) {

        List a = new ArrayList();
        List b = new LinkedList();
        List c = new Vector();
        List d = new Stack();

        //They share the same Interface (List)

    //------------------------------------------


        //Simple array
            // We have to initiate the variable with the length, that is, can't be changed
            // Can contain primitive or object types
            // Each element in array has to be the same type

        String[] arr = new String[3];

        // java.util.Arrays is the class that implements array utility methods

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
    }

    private static void linkedListThreadSafe(List b) {
        List bCopy = Collections.synchronizedList(b); //make a copy of the list, but synchronized.
        // now is thread safe
    }

    private static void linkedList(List<String> b) {
        b.add("1");
        b.add("1");
        b.add("1");
        System.out.println(b);

        b.add(1,"0");
        System.out.println(b);

        ((LinkedList<String>) b).removeFirst();
        System.out.println(b);
    }


}
