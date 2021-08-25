package day45.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

  public static void main(String[] args) {
    List<String> l1 = new ArrayList<>();
    l1.addAll(Arrays.asList("Ali", "Zehra", "Ayşe", "Şakir", "Dila"));

    System.out.println("Listin ilk hali : " + l1);

    //l1 elemanlarını foreach kullanarak yazdırın

    for (String string : l1) {
      System.out.print(string + ", ");
    }

    //l1 elemanlarını foreach kullanarak yanına :-) yazdırıp uptade edip yazdırın

    System.out.println("");
    System.out.println("******************************************");

    for (String string : l1) {
      System.out.print(string + " :-) ");
    }

    System.out.println("");
    System.out.println("******************************************");

    List<String> l2 = new ArrayList<>(Arrays.asList("s", "a", "i", "d"));
    Iterator it1 = l2.iterator();
    while (it1.hasNext()) {
        it1.next();
        it1.remove();
        
    }
    System.out.println("l2 nin iterator sonrası : "+l2);

 

  }
}
