package set.TressSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeComparator {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new myComparator());
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println(t);
    }
}

class myComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2) {
            return +1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}
