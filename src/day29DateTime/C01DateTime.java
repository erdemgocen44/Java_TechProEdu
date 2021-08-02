package day29DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class C01DateTime {

  public static void main(String[] args) {
    LocalDate tarih = LocalDate.now();
    System.out.println("Bugünün tarihi : " + tarih);
    System.out.println("21 gün sonrasının tarihi : " + tarih.plusDays(21));
    System.out.println("51 yıl sonrasının tarihi : " + tarih.plusYears(51));
    System.out.println(
      "Bugünden 1 yıl 5 ay 3 gün sonrası : " +
      tarih.plusYears(1).plusMonths(5).plusDays(3)
    );

    System.out.println("Bugünden 40 gün öncesi : " + tarih.minusDays(40));

    System.out.println(
      "Bugünden 5 yıl önce 2 ay sonra  gün önceye gidelim : " +
      tarih.minusYears(5).plusMonths(2).plusWeeks(3)
    );
    System.out.println(tarih.getDayOfMonth());
    System.out.println(tarih.getDayOfYear());
    System.out.println(tarih.getDayOfWeek());
    System.out.println(tarih.getMonth());
    System.out.println(tarih.getMonthValue());

    LocalDate dogumGunu = LocalDate.of(1983, 4, 29);

    System.out.println("Benim doğum günüm : " + dogumGunu);

    System.out.println("Doğumgünüm : " + tarih.getDayOfWeek());

    System.out.println(tarih.isAfter(dogumGunu));
    System.out.println(dogumGunu.isBefore(tarih));

    System.out.println("Bugün artık yıl mı : "+tarih.isLeapYear());



  }
}
