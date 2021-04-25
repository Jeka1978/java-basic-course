package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalDate now1 = LocalDate.now();
        LocalDateTime now2 = LocalDateTime.now();

        LocalDate myBirthday = LocalDate.of(1978, 3, 10);
        LocalDate myBirthday2 = LocalDate.of(1980, 3, 10);


        long between = ChronoUnit.DAYS.between(myBirthday, myBirthday2);
        System.out.println("between = " + between);


        // yyyy-mm-dd
        //todo write a method which take 2 params Dates in string format and return difference in days between

        //todo write a method which takes a sting in format yyyy-dd-mm and return string in format yy-mm-dd





    }
}
