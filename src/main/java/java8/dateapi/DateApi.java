package main.java.java8.dateapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * DateApi.java
 */
public class DateApi {

    public void testDateApi(){

        System.out.println("\nDateAPI test");
        Clock clock = Clock.systemDefaultZone();
        long milis = clock.millis();
        System.out.println("Current milis: " + milis);

        Instant instant = clock.instant();
        System.out.println("Instant: " + instant);
        Date date = Date.from(instant);
        System.out.println(date);

        System.out.println("Zone IDs:");
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println("Europe/Berlin: " + zone1.getRules());
        System.out.println("Brazil/East: " + zone2.getRules());

        System.out.println("Local times:");
        LocalTime time1 = LocalTime.now(zone1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println(time1.isBefore(time2));

        long hoursdif = ChronoUnit.HOURS.between(time1, time2);
        long minutesdif = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Hours between: " + hoursdif);
        System.out.println("Minutes between: " + minutesdif);

        LocalTime localTime = LocalTime.of(23,59,59);
        System.out.println("Local time: " + localTime);

        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                    .ofLocalizedTime(FormatStyle.SHORT)
                    .withLocale(Locale.GERMAN);
        LocalTime localTime1 = LocalTime.parse("13:25", germanFormatter);
        System.out.println("LocalTimeFormatter: " + localTime1);

        System.out.println("Local date: ");
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);
        LocalDate independence = LocalDate.of(2014, Month.JULY, 4);
        DayOfWeek dayOfWeek = independence.getDayOfWeek();
        System.out.println("Day of week: " + dayOfWeek);

        DateTimeFormatter germanFormatter2 =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);

        LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter2);
        System.out.println("Christmas: " + xmas);

        System.out.println("LocalDateTime: ");
        LocalDateTime localDateTime = LocalDateTime.of(2014, Month.DECEMBER, 31, 12, 12, 12);
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        long minuteOfDay = localDateTime.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println("Minute of day: " + minuteOfDay);

        Instant instant1 = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date legacyDate = Date.from(instant1);
        System.out.println("Legacy date: " + legacyDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy - HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13", dateTimeFormatter);
        String string = dateTimeFormatter.format(parsed);
        System.out.println("Formated date: " + string);

    }

}
