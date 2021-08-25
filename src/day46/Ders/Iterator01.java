package day46.Ders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>(
      Arrays.asList("h", "a", "l", "i", "d", "e")
    );
    System.out.println("ilk hali : " + list1);

    ListIterator lt2 = list1.listIterator();
    int count = 0;
    while (lt2.hasNext()) {
      String depo = (String) lt2.next();
      if (count == list1.size() - 1) {
        lt2.set(" :) " + depo);
      }

      count++;
    }
    while (lt2.hasPrevious()) {
      String depo = (String) lt2.previous(); //kursoru önceki elemanının önüne getirir

      System.out.print(depo);
    //hasPrevious()ve prrevious()methodlarının çalışması
    //   için öncesinde MUTLAKA KESİNLİKLE hasNext()ve next()
    //   methodları çalıştırılarak cursor(pointer)en sona getirilmelidir.
    }
  }
}
