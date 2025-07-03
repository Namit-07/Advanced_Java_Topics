package Practise_Sets;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_AdvancedJava_PracSet {
    public static void main(String[] args) {
        // Question 1
        ArrayList ar = new ArrayList();
        ar.add("Hello");
        ar.add("World");
        ar.add("Nobita");
        ar.add("Doraemon");
        ar.add("Shizuka");
        ar.add("Suneo");
        ar.add("Gian");
        ar.add("Dekisuki");
        ar.add("Takeshi");
        ar.add("Suno\n");

        for (Object O:ar){
            System.out.println(O);
        }

        // Question 2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds() +"\n");


        // Question 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n");

        // Question 4
        LocalDateTime tdt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("k:m:ss\n");
        String t = tdt.format(dtf);
        System.out.println(t);

        // Question 5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(9);
        hs.add(8);
        hs.add(98);
        hs.add(7);
        hs.add(9);
        System.out.println(hs);

    }
}
