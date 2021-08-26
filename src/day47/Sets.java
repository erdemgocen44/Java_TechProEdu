package day47;

import java.util.Set;
import java.util.TreeSet;

public class Sets {

  public static void main(String[] args) {
   Set<String>lh1=new TreeSet<>();
   lh1.add("Ali");
   lh1.add("Canan");
   lh1.add("Remziye");
   lh1.add("Veli");
   System.out.println(lh1);

   Set<String>lh2=new TreeSet<>();
   lh2.add("Ali");
   lh2.add("Canan");

   System.out.println(lh1.retainAll(lh2));
   System.out.println(lh1);

   System.out.println("***********************************");

   





  }
}
