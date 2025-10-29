import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default format: " + DateFormatter.format(today, "yyyy-MM-dd"));
        System.out.println("US format: " + DateFormatter.format(today, "MM/dd/yyyy"));
        System.out.println("Full format: " + DateFormatter.format(today, "EEEE, MMM dd yyyy"));
    }
}
