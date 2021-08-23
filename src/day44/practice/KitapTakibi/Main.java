package day44.practice.KitapTakibi;

import java.util.Scanner;

public class Main extends KitapBilgileri {

  /*
	 * Kitap no 1000'den baslayarak sirali no olsun
	 * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
	 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun
	 * 1- kitap ekle
	 * 2- numara ile kitap goruntule
	 * 3- bilgi ile kitap goruntule
	 * 4- numara ile kitap sil
	 * 5- Tum kitaplari listele
	 * 6- çıkış

    */
  static Scanner scan = new Scanner(System.in);
  static int secim = 0;

  public static void main(String[] args) {
    KitapBilgileri kitapBilgileri = new KitapBilgileri();

    do {
      menu();
      switch (secim) {
        case 1:
          kitapBilgileri.kitapEkle();
          break;
        case 2:
        kitapBilgileri.noIleGoruntule();
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          System.out.println("Çıkış yapılıyor, hayırlı günler");
          break;
        default:
          System.out.println("Lütfen geçerli bir numara giriniz");
          break;
      }
    } while (secim != 6);
  }

  public static void menu() {
    System.out.println("==============ANA MENÜ==============");
    System.out.println(
      "1) Kitap ekle  \n2) Numara ile kitap görüntüleme  \n3) Bilgi ile kitap görüntüleme  \n4) Numara ile kitap sil  \n5) Tüm kitapları listele  \n6) Çıkış  "
    );
    System.out.print("Seçiminizi giriniz : ");
    secim = scan.nextInt();
  }
}
