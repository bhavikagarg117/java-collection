package Phase2_Collections;
import java.util.*;

public class SequencedCollections_eg1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        SortedSet<Integer> newset = treeSet.subSet(10,30);
        System.out.println(newset);

    }
}
