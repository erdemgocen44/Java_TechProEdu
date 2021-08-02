package day29DateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.swing.text.DateFormatter;

public class C04_DateTimeFormatter {

  public static void main(String[] args) {

    /*
         * yy: YILIN SON iKi RAKAMI
         * yyyy : yılın tamamını
         * y : yılın tamamını
         * M : ay sırasını verir TEMMUZ için : 7
         * MM:  ay sırasını veriri TEMMUZ için : 07
         * MMM . ay isminin ilkuc harfini verir. JUL
         * MMMM : ay isminin tamamını verir
         */


    LocalDate tarih = LocalDate.now();

    LocalDate date = LocalDate.of(2020, 5, 15);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yy");
    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
    DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd$MMM$yyyy");

    System.out.println(dtf.format(tarih));
    System.out.println(dtf2.format(tarih));
    System.out.println(dtf3.format(date));
    System.out.println(dtf4.format(date));

    LocalDate dt=LocalDate.of(1983, 4, 29);
    System.out.println("Bugünün tarihi : "+tarih);
    System.out.println("doğum Tarihim : "+dt);
    Period yasim=Period.between(dt, tarih);

    System.out.println("Şuanki yaşım : "+yasim);    
  }
}
