package Phase2_Collections;
import java.util.*;

//Deep dive into collection interface
//Write a method that takes two Sets of integers and returns a new Set containing only the elements that are present in both sets.
public class Collections_eg2 {
    public static HashSet<Integer> setIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(6,7,8,9,10,11));
        HashSet<Integer> finalset = setIntersection(set1, set2);
        System.out.println(finalset);
    }









}
