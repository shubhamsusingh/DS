package compare;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new myComparator());
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        System.out.println(t);
    }
}

class myComparator implements Comparator<Integer> {
    public int compare(Integer obj1, Integer obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}
