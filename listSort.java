package Phase2_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class listSort {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("D");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);





    }
}
