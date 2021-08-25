package day45.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
public class Iterator02 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "ı", "k"));
    System.out.println("ilk hali : "+list);

    ListIterator lt1 = list.listIterator();
    while (lt1.hasNext()) {
      String depo = (String) lt1.next();
      lt1.set(depo+" :-)");
      
    }
    System.out.print(list);
    System.out.println();
    System.out.println("**********************");

    List<String> list1 = new ArrayList<>(Arrays.asList("h", "a", "l", "i", "d","e"));
    System.out.println("ilk hali : "+list1);

    ListIterator lt2=list1.listIterator();
    int count=0;
    while (lt2.hasNext()) {
       String depo= (String) lt2.next();
       if(count==list1.size()-1){
           lt2.set(depo+" :) ");

       }
       
        count++;
        
    }System.out.println(list1);
  }
}
