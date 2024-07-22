package Phase2_Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class StringLength implements Comparable<StringLength> {
    String value;

    public StringLength(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(StringLength other) {
        return Integer.compare(this.value.length(), other.value.length());
    }

    @Override
    public String toString() {
        return value;
    }
}

public class SortingByLength {
    public static void main(String[] args) {
        List<StringLength> list = new ArrayList<>();
        list.add(new StringLength("apple"));
        list.add(new StringLength("banana"));
        list.add(new StringLength("kiwi"));

        System.out.println("Before sorting");
        for (StringLength s : list) {
            System.out.println(s);
        }


        Collections.sort(list);

        System.out.println("After sorting");
        for (StringLength s : list) {
            System.out.println(s);
        }
    }
}
