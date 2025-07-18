package set.Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.add(4);
        hset.add(5);
        System.out.println(hset);
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(6);
        Al.add(7);
        hset.addAll(Al);
        System.out.println(hset);
        hset.remove(6);
        System.out.println(hset);
        System.out.println(hset.contains(1));
        Object[] objectArray = hset.toArray();
        int[] hashArray = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            hashArray[i] = (int) objectArray[i];
        }
        for (int num : hashArray) {
            System.out.println(num);
        }
    }

}
