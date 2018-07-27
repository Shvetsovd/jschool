import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static final DateTimeFormatter DATE_TIME = DateTimeFormatter
            .ofPattern("['Дата ' dd-MMMM-YYYY' ']['Время' HH:mm:ss]");

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(DATE_TIME));
        System.out.println(LocalDate.now().format(DATE_TIME));
        System.out.println(LocalTime.now().format(DATE_TIME));

        //Потестить
        System.out.println(viewArrivalTime(LocalDateTime.now(), ZoneOffset.ofHours(10), Duration.ofHours(5)));
    }
    public static boolean isFriday13(LocalDate date){
        return date.getDayOfMonth() == 13
                && date.getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }
    public DayOfWeek getFirstDayOfWeek(Month month){
        return LocalDate.of(Year.now().getValue(), month, 1)
                .getDayOfWeek();
    }
    public static List<LocalDate> listAllMondayInCurrentYear(final Month month){
        List<LocalDate> mondays = new ArrayList<>();
        LocalDate date = LocalDate.of(Year.now().getValue(), month, 1)
                            .with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());

        while (date.isBefore(lastDayOfMonth)){
            mondays.add(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        return mondays;
    }
    public static LocalDateTime viewArrivalTime(
            LocalDateTime dateTimeInDepartureZone,
            ZoneId targetZone,
            Duration flightTime
    ){
        ZonedDateTime departureZonedTime = ZonedDateTime.of(dateTimeInDepartureZone, ZoneId.systemDefault());
        ZonedDateTime arrivalZonedTime = departureZonedTime.plus(flightTime).withZoneSameLocal(targetZone);

        return arrivalZonedTime.toLocalDateTime();
    }

}
