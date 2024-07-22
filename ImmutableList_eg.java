package Phase2_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ImmutableList_eg {
    public static void main(String[] args) {
        ArrayList<String> mutableList = new ArrayList<String>();
        mutableList.add("A");
        mutableList.add("B");
        mutableList.add("C");
        mutableList.add("D");
        List<String> immutableList= Collections.unmodifiableList(mutableList);
        System.out.println(immutableList);

    }
}
