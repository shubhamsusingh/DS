package cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        ListIterator ltr = al.listIterator();
        while (ltr.hasNext()) {
            Integer i = (Integer) ltr.next();
            System.out.println(i % 2 == 0 ? "Even" : i);

        }
    }

}
