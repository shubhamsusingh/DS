package set.TressSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(11);
        tree.add(2);
        tree.add(32);
        tree.add(25);
        tree.add(5);
        System.out.println(tree);
        System.out.println("First Elements : " + tree.first());
        System.out.println("Last Element : " + tree.last());
        System.out.println("Head Set : " + tree.headSet(3));
        System.out.println("tail Set : " + tree.tailSet(3));
        System.out.println("Sub Set : " + tree.subSet(2, 36));
        System.out.println("Celling (eqal or greater than element): " + tree.ceiling(3));
        System.out.println(" floor (eqal or lower than element): " + tree.floor(26));
        System.out.println("heigher Element : " + tree.higher(2));
        System.out.println("lower Element : " + tree.lower(3));
        System.out.println("removed : " + tree.remove(2));
        System.out.println(tree);
        System.out.println("Contains : " + tree.contains(2));
    }
}
