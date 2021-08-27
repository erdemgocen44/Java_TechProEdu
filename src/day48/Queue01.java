package day48;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
/*
Fifo==>>Elemanlar ilk giren ilk silinir. eczane yemekhane
vs sektorlerde zaman kaydı tutulmasında kullanılır.
Queue interfacenin iki subClass constructoru ile obj create
edilir.
LinkedList constructoru ile obj create edilirse elemanlar 
Queue içinde isertion ordera göre sıralanır.

PrşorştyQueue constructoru ile obj create edilirse elemanlar 
Queue içinde Javanın kendi algoritmasına göre
sıralanır.
*/
  public static void main(String[] args) {
    Queue<String> q1 = new LinkedList<>();

    q1.add("basri");
    q1.add("hakan");
    q1.add("sedef");
    q1.add("ahmet");
    System.out.println(q1);//[basri, hakan, sedef, ahmet]

    Queue<String> q2 = new PriorityQueue<>();
    q2.add("rabia");
    q2.add("oguz");
    q2.add("yagmur");
    q2.add("mehmet");
    System.out.println(q2);//[mehmet, oguz, yagmur, rabia] java burada kendi algoritmasına göre önceliklendirir


System.out.println( q1.peek());//ilk elemanı silmeden bize return eder

System.out.println( q1);//[basri, hakan, sedef, ahmet]

System.out.println(q1.poll());//basri//ilk elemanı silerek return eder
System.out.println(q1);//[hakan, sedef, ahmet]

System.out.println(q1.remove());//ilk elemanı siler ve sildiğini return eder

q1.clear();//tamamını sildik

System.out.println(q1.poll());//null verir

//System.out.println(q1.remove());//RTE verir
System.out.println(q1.offer("Merve"));//eleman ekler ve true döner
System.out.println(q1);//offer methodu add methodu gibi 
                    //eleman ekler. Ancak eleman sınırı 
                    //varsa add çalışmaz(outOfBound veye 
                    //IllegalStateException hatası verir 
                    //ve exception fırlatır) ama offer 
                    //çalışır.








  }
}
