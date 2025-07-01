import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(20);
        l2.add(25);

        l1.add(1);
        l1.add(6);
        l1.add(3);
        l1.add(11);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(25));
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.isEmpty());
        System.out.println(l1.size());
        //l1.clear();
        for (int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
