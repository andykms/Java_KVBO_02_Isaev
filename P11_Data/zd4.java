import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Main {
    static void createDateAndCalendar(int year, int month, int day, int hour, int minute) {
      LocalDate localDate = LocalDate.of(year, month, day);
      Calendar calendar = GregorianCalendar.getInstance();
      calendar.set(year, month - 1, day, hour, minute); // корректировка с учётом Java-календаря
      System.out.println(localDate + " " + hour + ":" + minute + ": " + calendar.getTime());
  }

  public static void main(String[] args) throws ParseException {
      createDateAndCalendar(2023, 5, 18, 16, 30);
  }
}