package compare;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorQusetion implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        return -s1.compareTo(s2);
    }
}
