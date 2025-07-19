import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> sSet = new TreeSet<>();
        sSet.add(1);
        sSet.add(2);
        sSet.add(3);
        sSet.add(4);
        sSet.add(5);
        System.out.println(sSet);
        System.out.println("First Emlement : " + sSet.first());
        System.out.println("Last Emlement : " + sSet.last());
        System.out.println("headSet : " + sSet.headSet(3));
        System.out.println("TailSet : " + sSet.tailSet(3));
        System.out.println("Is 1 contains ? " + sSet.contains(1));
        System.out.println("remove 2 from set :" + sSet.remove(2));

    }
}
