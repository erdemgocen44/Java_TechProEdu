package day29DateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

  public static void main(String[] args) {
    LocalTime zaman = LocalTime.now();

    System.out.println("Şuan da saat tam olarak : " + zaman);

    LocalTime time1 = LocalTime.of(12, 35, 23);

    System.out.println(time1);

    System.out.println(
      "Şu zamanda 2 saat ileri, 34 dk geri, 45 sn ileri : " +
      zaman.plusHours(2).minusMinutes(34).plusSeconds(45)
    );

    for (int i = 0; i < 10; i++) {
        System.out.print(i);
    }
    LocalTime zaman2=LocalTime.now();

    System.out.println(zaman2);

    //Ülke saatleri hesaplama:

    ZonedDateTime baskaUlke=ZonedDateTime.now(ZoneId.of("America/New_York"));

    System.out.println(baskaUlke);
  }
}
