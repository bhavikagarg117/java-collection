package Phase2_Collections;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayOpseg {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("D");
        System.out.println("the list is: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sorting: ");
        System.out.println(list);
        list.remove("C");
        System.out.println("after removing element C");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("after reversing list");
        System.out.println(list);


    }
}
