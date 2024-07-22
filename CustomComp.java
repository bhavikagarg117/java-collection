package Phase2_Collections;

import java.util.*;

class StringLenComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else return 0;
    }

}

public class CustomComp {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList(Arrays.asList("apple","banana","pineapple"));
        Collections.sort(fruits, new StringLenComp());
        System.out.println(fruits);






    }
}
