package day46.Ders;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01 {

  public static void main(String[] args) {
    LinkedList<String> ll1 = new LinkedList<>(
      Arrays.asList("erdem", "mehmet", "samet", "said", "yağmur")
    );
    System.out.println(ll1); //[erdem, mehmet, samet, said, yağmur]
    ll1.add("merve"); //add yapılan node yi LinkedListin sonuna ekler
    System.out.println(ll1); //[erdem, mehmet, samet, said, yağmur, merve]

    ll1.add(2, "faruk");
    System.out.println(ll1);
    LinkedList<String> ll2 = new LinkedList<>(Arrays.asList(" :-)", ":-( "));
    ll1.addAll(ll2);
    System.out.println(ll1);
    ll1.addFirst("gayet");
    System.out.println(ll1);
    ll1.addLast("başarılı");
    System.out.println(ll1);

    ll1.addAll(3, ll2);
    System.out.println(ll1);

    ll1.remove(); //remove ilk elementi siler
    System.out.println(ll1);

    ll1.removeFirst();
    System.out.println(ll1);

    ll1.remove("faruk");
    System.out.println(ll1);

    ll1.remove(2);
    System.out.println(ll1);

    ll1.removeFirstOccurrence(" :-)");
    System.out.println(ll1);

    ll1.removeLastOccurrence("");
    System.out.println(ll1); //[mehmet, samet, said, yağmur, merve,  :-), :-( , başarılı]

    LinkedList<Integer> ll3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    System.out.println(ll3); //[1, 2, 3, 4, 5, 6]

    ll3.remove(2);
    System.out.println(ll3); //[1, 2, 4, 5, 6]

    //ll3.remove(33);RTE
    // System.out.println(ll3);

    ll3.remove(ll3.indexOf(6));
    System.out.println(ll3); //[1, 2, 4, 5]

    ll1.removeAll(ll2);
    System.out.println(ll1); //[mehmet, samet, said, yağmur, merve, başarılı]

    
    System.out.println(ll1.get(3));
  }
}
