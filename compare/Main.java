package compare;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>(new ComparatorQusetion());
        tr.add("Shubham");
        tr.add("Rahul");
        tr.add("Zyan");
        tr.add("Bipin");
        tr.add("Amar");
        System.out.println(tr);
    }
}
