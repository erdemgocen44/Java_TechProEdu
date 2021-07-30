package day27;

public class C01_StaticBlok01 {

  static int sayi = 10;

  static {
    System.out.println("1.Static blok çalıştı");
    sayi=20;
  }
  static {
    System.out.println("1,5.Static blok çalıştı");
    sayi=14;
  }
  static {
    System.out.println("2.Static blok çalıştı");
    sayi=45;
  }

  public static void main(String[] args) {

    System.out.println("Main metodun ilk satırında sayi : " + sayi);
  }
}
