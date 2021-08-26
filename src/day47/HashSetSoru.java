package day47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetSoru {

  public static void main(String[] args) {
    /*
İcinde degerleri olan bir array i arraylist e cevirecek 
return tipi arrayList olacak bir metod yaziniz.
{“reha”, “hakan”, “haluk”, “ipek”, “ahsen”}
main metod altinda metod ile gelen listeyi kullanarak HashSet, 
TreeSet ve linkedHashSet leri doldurun.
        */

    String[] arr = { "erdem", "mine", "dila", "akif", "merve" };

    ArrayList<String> list = new ArrayList<>();
    list = cevir(arr);
    System.out.println(list);

    HashSet<String> hs = new HashSet<>(list);
    LinkedHashSet<String> lhs = new LinkedHashSet<>(list);
    TreeSet<String> ths = new TreeSet<>(list);
    System.out.println("hurra : " + hs);
    System.out.println("giriş sırası : " + lhs);
    System.out.println("alfabetik sıra : " + ths);
  }

  public static ArrayList<String> cevir(String[] arr) {
    ArrayList<String> ArrList = new ArrayList<>();
    for (String w : arr) {
      ArrList.add(w);
    }
    return ArrList;
  }
}
