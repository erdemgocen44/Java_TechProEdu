package day30;

import java.util.ArrayList;
import java.util.List;

public class C03_VarargSoru02 {

  public static void main(String[] args) {
    // verilen int lerden ilki haric tum sayilari
    // toplayan ve buldugunuz toplam ile ilk
    // sayiyi carpip sonucu yazdirin.

    topla(2, 3, 6, 7, 1, 12,23,6,88
    );
  }

  private static void topla(int carpilacakSayi, int... toplanacaklar) {
    int toplam = 0;
    int count = 0;
    for (int each : toplanacaklar) {
      toplam += each;
      count++;
    }
    System.out.println(
      "Varargsa dahil olan " +
      count +
      " sayının toplamı ile "+carpilacakSayi+" sayısının çarpımı : " +
      (carpilacakSayi * toplam)
    );
  }
}
