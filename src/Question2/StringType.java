package Question2;

import java.util.Comparator;

public class StringType implements Comparator<String> {

    public int compare(String o1, String o2) {
//        if(o1.compareTo(o2) == -1) return -1;
//        if(o1.compareTo(o2) == 1) return 1;
//        return 0;
        return o1.compareTo(o2);
    }
}
