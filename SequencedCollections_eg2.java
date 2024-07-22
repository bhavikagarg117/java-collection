package Phase2_Collections;
import java.util.*;
//Question
//You are given a list of integers. Write a program to process the list such that:
//All even integers are added to the front of a Deque.
//All odd integers are added to the end of the same Deque.
//Finally, print the elements of the Deque in the order they were added.
public class SequencedCollections_eg2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Deque<Integer> deque1= new LinkedList<Integer>();
        for (int n: numbers) {
            if (n % 2 == 0) {
                deque1.addFirst(n);
            }
            else deque1.addLast(n);
        }
        System.out.println(deque1);

    }
}

