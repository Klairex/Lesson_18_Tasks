import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        //Task1
        LocalDate date1 = LocalDate.of(2024, 1, 2);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d MMMM yyyy" , Locale.forLanguageTag("ro"));
        String dateF = date1.format(dtf);
        System.out.println(dateF);

        //Task2
        LocalTime time1 = LocalTime.of(13, 20);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
        String timeF = time1.format(dtf2);
        System.out.println(timeF);

        //Task3
        LocalDateTime dateTime1 =  LocalDateTime.of(date1,time1);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm" , Locale.forLanguageTag("ro"));
        String dateTimeF = dateTime1.format(dtf3);
        System.out.println(dateTimeF);

        //Task4
        ZonedDateTime zonedDateTime1 = dateTime1.atZone(ZoneId.of("America/Los_Angeles"));
        String zonedDateTimeF = zonedDateTime1.format(dtf3);
        System.out.println(zonedDateTimeF);


        //Task5
        LocalDateTime dateTime2 = dateTime1
                .plusYears(1)
                .plusMonths(1)
                .plusDays(1)
                .plusHours(1)
                .plusMinutes(1);
        String dateTime2F = dateTime2.format(dtf3);
        System.out.println(dateTime2F);



    }
}
