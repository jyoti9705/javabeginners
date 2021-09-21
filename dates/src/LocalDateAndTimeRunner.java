import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeRunner {
    public static void main(String[] args) {

        //Prints Just Date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //Output :2021-09-21
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());
        System.out.println(localDate.lengthOfYear());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.plusDays(100));
        System.out.println(localDate.plusMonths(20));


        //Prints both local date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //Output : 2021-09-21T13:19:16.407358900
        //LocalDateTime provides all the options available in local dates in addition to it , also provides plusminutes , seconds and many more time methods

        //Prints only localtime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        //Output : 13:20:33.800638900







    }
}
