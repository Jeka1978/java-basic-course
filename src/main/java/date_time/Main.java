package date_time;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

//        DateTime dateTime = new DateTime();   from joda time
        LocalTime now = LocalTime.now();
        LocalDate now1 = LocalDate.now();
        LocalDateTime now2 = LocalDateTime.now();

        String chineese = now2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINESE);
        String chineese4 = now2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN);
        String chineese2 = now2.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.CANADA_FRENCH);
        String chineese3 = now2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CANADA_FRENCH);

        System.out.println(chineese);
        System.out.println(chineese2);
        System.out.println(chineese3);
        System.out.println(chineese4);


        LocalDate myBirthday = LocalDate.of(1978, 3, 10);
        LocalDate myBirthday2 = LocalDate.of(1980, 3, 10);


        long between = ChronoUnit.DAYS.between(myBirthday, myBirthday2);
        System.out.println("between = " + between);


        //todo write method which convert LocalDate to timespamp
        //todo write method which convert LocalDate to java.util.Date
        //todo write method which convert  java.util.Date to LocalDate

    }

}
