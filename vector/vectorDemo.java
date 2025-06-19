package vector;

import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.addElement(3);
        System.out.println(v);
        v.addFirst(0);
        v.addLast(4);
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            System.out.println(i % 2 == 0 ? "Even" : i);

        }
    }
}
