package day29DateTime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class halukHocaSoru02 {

  public static void main(String[] args) {
    //      2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
    //      listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
    //      Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
    //         Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
    String isim[][] = {
      { "Ali", "Veli", "Ayse" },
      { "Hasan", "Can" },
      { "Suzan" },
    };
    /*
        "Ali", "Veli", "Ayse"  -->0. kat
        "Hasan", "Can"        -->1.kat
        "Suzan"               -->.kat
         */

    yeniListe(isim);
  }

  public static void yeniListe(String[][] isim) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < isim.length; i++) {
      for (int j = 0; j < isim[i].length; j++) {
        list.add(isim[i][j]);
      }
    }
    System.out.println("siralama oncesi : " + list);
    Collections.sort(list);
    System.out.println("siralama sonrasi : " + list);
  }
}
