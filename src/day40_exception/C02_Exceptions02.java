package day40_exception;

import java.util.Scanner;

public class C02_Exceptions02 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = 1;
    while (count <= 34) {
      System.out.print("Bölünen sayıyı giriniz : ");
      int sayi1 = scan.nextInt();
      System.out.print("Bölen sayıyı giriniz : ");
      int sayi2 = scan.nextInt();
      try {
        System.out.println("Bölüm : " + sayi1 / sayi2);
      } catch (ArithmeticException e) {
        System.out.println("Bölen 0 olamaz, tekrar deneyin"); //-->>manuel handle
        System.out.println(e.getMessage()); //by zero-->>handle edilecek veri
      }
    }
    count++;
  }
}
