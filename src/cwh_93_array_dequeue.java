import java.util.ArrayDeque;

public class cwh_93_array_dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(56);
        ad.add(6);
        ad.add(9);
        ad.addFirst(8);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad);
    }
}
