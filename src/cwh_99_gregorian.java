import java.util.Calendar;
import java.util.GregorianCalendar;

public class cwh_99_gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));

    }
}
