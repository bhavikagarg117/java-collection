package Phase2_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class waysOfIterating {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("1. USING FOREACH");
        for (int n: list) {
            System.out.print(n);
        }

        System.out.println("\n"+"2. USING ITERATOR");
        Iterator<Integer> it= list.iterator();

        while (it.hasNext()) {
            Integer i = it.next();
            System.out.print(i); }

        System.out.println("\n"+"3. USING LIST_ITERATOR");
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            Integer num = lit.next();
            System.out.print(num); }

        System.out.println("\n"+"4. BACKWARD USING LIST_ITERATOR");
        ListIterator<Integer> backlit = list.listIterator();
        while (backlit.hasPrevious()) {
            Integer num1 = backlit.previous();
            System.out.print(num1); }

    }
}
