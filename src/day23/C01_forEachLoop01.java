package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_forEachLoop01 {
   public static void main(String[] args) {
      /*
       * 1)Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. Kullanici
       * "yeter" yazana kadar isim istemeye devam edin. Kullanici isim girmeyi
       * bitirdiginde toplam kac isim girdigini ve bunlardan kac tanesinin asagidaki
       * listede olan isimlerden oldugunu yazdirin isimList=Ali , Veli, Ayse, Fatma,
       * Zeki, Kemal Not : kucuk buyuk harf onemli degil ancak isimler için önemli
       */
      Scanner scan = new Scanner(System.in);
      List<String> girilenIsimler = new ArrayList<>();
      String isim;

      do {
         System.out.println("Lütfen listeye eklemek için isim giriniz\nBitirmek için ise yeter yazınız.");

         isim = scan.nextLine();

         if (!isim.equalsIgnoreCase("yeter")) {
            girilenIsimler.add(isim);
         }

      } while (!isim.equalsIgnoreCase("yeter"));

      String isimler[] = { "Ali", "Veli", "Ayşe", "Fatma", "Zeki", "Kemal" };

      List<String> isimList = Arrays.asList(isimler);

      System.out.println("Toplam " + girilenIsimler.size() + " isim girdiniz");

      int count = 0;

      for (int i = 0; i < girilenIsimler.size(); i++) {

         if (isimList.contains(girilenIsimler.get(i))) {
            count++;
         }
      }
      System.out.println("Girdiğiniz isimlerden " + count + " tanesi bendeki listede kayıtlı");

   }
}
