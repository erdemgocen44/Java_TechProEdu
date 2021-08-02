package day29DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();

    System.out.println("Şuan ki tarih ve zaman : " + ldt);

    LocalDate d = LocalDate.of(2021, 5, 4);

    LocalTime t = LocalTime.of(23, 12, 44);

    LocalDateTime ldt1 = LocalDateTime.of(d, t);
    System.out.println(d);
    System.out.println(t);

    System.out.println("Local zaman : " + ldt1);
    System.out.println("Local zaman : " + d+", Saat : "+t);

    System.out.println(ldt.getHour());

  }
}
