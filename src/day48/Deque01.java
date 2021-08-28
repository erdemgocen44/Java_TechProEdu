package day48;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

  public static void main(String[] args) {
    Deque<String> dq1 = new LinkedList<>(
      Arrays.asList(
        "Suna",
        "Onur",
        "Süleyman",
        "Harun",
        "Mine",
        "Dila",
        "Merve"
      )
    );
    System.out.println(dq1); //[Suna, Onur, Süleyman, Harun, Mine, Dila, Merve]
    System.out.println(dq1.peekFirst()); //Suna//ilk elemanı verir ama silmez
    System.out.println(dq1.pollFirst()); //Suna//ilk elemanı verir ama siler
    System.out.println(dq1); //[Onur, Süleyman, Harun, Mine, Dila, Merve]
    System.out.println(dq1);

    System.out.println(dq1.peekLast()); //Merve//Son elemanı verir ve silmez
    System.out.println(dq1.pollLast()); //Merve//Son elemanı verir ve siler
    System.out.println(dq1); //[Onur, Süleyman, Harun, Mine, Dila]
    System.out.println(dq1.getFirst()); //Onur//İstenilen ilk elemanı getirir ama silmez
    System.out.println(dq1.getLast()); //Dila//İstenilen ilk elemanı getirir ama siler
    System.out.println(dq1); //[Onur, Süleyman, Harun, Mine, Dila]
    System.out.println(dq1.pop()); //ilk elemanı silere verir

    dq1.clear(); //Sırayı tamamen boşalttık
    System.out.println(dq1.peekFirst()); //boş sıradan ilk eleman çapırdık
    System.out.println(dq1.peekLast());
    //System.out.println(dq1.getFirst());//boş sıradan get()methodu ile ilk elaman çağrılırsa NoSuchElementException hata fırlatır
    //System.out.println(dq1.getLast());//boş sıradan get()methodu ile son elaman çağrılırsa NoSuchElementException hata fırlatır

  }
}
