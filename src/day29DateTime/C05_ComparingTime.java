package day29DateTime;

import java.time.LocalDate;

public class C05_ComparingTime {

  public static void main(String[] args) {
    LocalDate bugun = LocalDate.now();

    LocalDate date = LocalDate.of(2021, 2, 11);
    int fark = bugun.compareTo(date);
    System.out.println(bugun);
    System.out.println(date);
    System.out.println(fark);
  }
}
