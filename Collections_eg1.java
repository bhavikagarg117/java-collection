package Phase2_Collections;
import java.util.*;

//Deep dive on the Collection Interface in java
//Write a method that takes a List of integers and returns a new List with duplicates removed. Preserve the order of the original list.


public class Collections_eg1 {
    public static List<Integer> removeDupes(List<Integer> list1) {
        HashSet<Integer> set= new HashSet<>(list1);
        List<Integer> ans= new ArrayList<>(set);
        return ans;
    }
    public static void main(String[] args) {
                List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3,4, 2, 5, 6, 7,8, 6, 9, 10));
                List<Integer> result = removeDupes(input);
                System.out.println(result);

    }
}



