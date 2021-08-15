package day40_exception;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class C01_Exception01 {

  public static void main(String[] args) {
    //EXCEPTİONS
    // İki tür exception vardır:
    // i)Compile Time (checked)Exceptions: kod create edilirken
    // Javanın öngördüğü olası sorunlara karşı hatanın altının
    // çizilmesi. Ama her altı kırmızı olan kod exception
    // değildir.

    // ii)Run Time(unchecked) Exceptions: Kod run edildiğinde
    // oluşan exceptionlara denir.

    // 1)Kod create edilirken Exception kullanılması gerekirse :
    // A) Add throws declarations : Hata oluştuğunda Console
    // hatayla ilgili mesaj verir.
    // B)try-catch block : Hata oluştuğunda hatanın yazdırılması ve
    // handle(fix edilmesi,düzeltilmesi,el atılması) edilmesini sağlar.

    // 2)try bloktan sonra mutlaka en az 1 tane catch blok olmalı
    // aksi halde CTE verir !!!!
    // 3)try-catch block da try body hatasız çalışırsa catch body çalışmaz.
    // catch body try body deki exceptionda çalışır.
    // 4)try body den sonra 1den fazla catch body create edilebilir.
    // Oluşan exception hangi catch ile ilgiliyse o body
    // çalışır.Aynı anda sadece tek catch body çalışır.

    //Kullanıcıdan alacağınız 2 tamsayının bölümünü yazdırınız.
    Scanner scan = new Scanner(System.in);

    System.out.print("Lütfen ilk sayıyı giriniz : ");
    int sayi1 = scan.nextInt();
    System.out.print("Lütfen ikinci sayıyı giriniz : ");
    int sayi2 = scan.nextInt();
    try {
      System.out.println("bölümün sonucu : " + sayi1 / sayi2);
    } catch (ArithmeticException e) {
      System.out.println("bölme işleminde bölen sıfır olamaz ");
    }
  }
}
