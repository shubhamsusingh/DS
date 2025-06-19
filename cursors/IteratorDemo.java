package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            System.out.println(i % 2 == 0 ? "even" : i);
        }
    }
}
