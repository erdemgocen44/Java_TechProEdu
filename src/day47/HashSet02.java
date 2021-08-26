package day47;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet02 {

  public static void main(String[] args) {
    /*
Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz 
bir collection elde etmek isterseniz ne kullanirsiniz
Cevap: TreeSet

Soru: Ama TreeSet cok yavastir. Nasil bir cozum 
bulabilirsin?
Cevap: HashSet olustururum, elemanlari HashSet’e 
eklerim.Sonra HashSet’i TreeSet’e ceviririm boylece 
tekrarsiz ve alfabetik sirada bir collection’a sahip 
olmus olurum.
        */
    long start1 = System.nanoTime();
    TreeSet<String> ts1 = new TreeSet<>(
      Arrays.asList("erdem", "mine", "dila", "akif", "merve")
    );

    long stop1 = System.nanoTime();
    System.out.println("treeSet hızı : " + (stop1 - start1));

    long start = System.nanoTime();
    HashSet<String> hs = new HashSet<>(
      Arrays.asList("erdem", "mine", "dila", "akif", "merve")
    );System.out.println(hs);

    TreeSet<String> ts = new TreeSet<>(hs);
    System.out.println(ts);
    long stop = System.nanoTime();
    System.out.println("hashset ilk hızı : " + (stop - start));
  }
}
