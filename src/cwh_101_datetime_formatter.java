import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetime_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E \nk:m a"); // This is the format pattern
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        String myDate = dt.format(dtf); // Creating date string using date and format
        String ilt = dt.format(dtf2);
        String ilt2 = dt.format(dtf3);
        String ilt3 = dt.format(dtf3);

        System.out.println(myDate);
        System.out.println(ilt);
        System.out.println(ilt2);
        System.out.println(ilt3);

    }
}
