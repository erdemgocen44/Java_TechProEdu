package day23;

import java.util.ArrayList;
import java.util.List;

public class C03_forEach03 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("ALI");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");

        // bu listedeki isimlerden uzunluğu 4 harfden
        // fazla olan isimleri yazdıralım

        // for-each loop index veya size bakmadan tek tek
        // tüm elementleri getirir.

        for (String each : list1) {
            if (each.length() > 4) {
                System.out.print(each + " ");
            }
        }
    }
}
