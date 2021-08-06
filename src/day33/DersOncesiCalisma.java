package day33;

import java.util.Scanner;

public class DersOncesiCalisma {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean cikilsinMi = false;
    while (!cikilsinMi) {
      System.out.println("--------------KİŞİSEL BİLGİ SİSTEMİ--------------");
      System.out.println(
        "1-İsminizi giriniz : \n2-Soyisminizi giriniz : \n3-Email adresinizi giriniz : \n4-Şifrenizi giriniz : \n5-Kredi kartı numaranızı giriniz :  \n6-Kısa bir açıklama yazınız : \n7-Çıkış"
      );

      System.out.println("Lütfen bir seçim yapınız");

      String secim = scan.nextLine();

      switch (secim) {
        case "1":
          System.out.println("Lütfen isminizi giriniz : ");
          String isim = scan.nextLine();
          String duzenleIsim = isim.substring(0, 1).toUpperCase()
          +isim.substring(1).replaceAll("\\w", "*");
          System.out.println(duzenleIsim);
          break;
        case "2":
          System.out.println("Lütfen soyisminizi giriniz : ");
          String soyIsim = scan.nextLine();
          String duzenleSoyisim = soyIsim.substring(0, 1).toUpperCase()
          +soyIsim.substring(1).replaceAll("\\w", "*");
          System.out.println(duzenleSoyisim);

          break;
        case "3":
          System.out.println("Lütfen emailinizi @ kısmına kadar giriniz : ");
          String email = scan.nextLine();
          System.out.print("\n Aşağıdaki e-posta adreslerinden uygun olanını seçiniz : \n1-@gmail.com\n2-@hotmail.com\n3-@yahoo.com\n4-@yandex.com\n");
      

          break;
        case "4":
          System.out.println("Lütfen şifrenizi giriniz : ");
          String sifre = scan.nextLine();

          break;
        case "5":
          System.out.println("Lütfen kredi kartı numaranızı giriniz : ");
          String kredi = scan.nextLine();

          break;
        case "6":
          System.out.println("Lütfen bir açıklama giriniz : ");
          String aciklama = scan.nextLine();

          break;
        case "7":
          System.out.println("Çıkış yapılıyor ");
          String cikis = scan.nextLine();

          break;
        default:
          System.out.println("Lütfen geçerli bir seçim yapınız");
          break;
      }
    }
  }
}
