package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_list01 {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();

        isimler.add("Ali");
        System.out.println(isimler);

        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Fatma");
        isimler.add("Ali");
        System.out.println(isimler);
        isimler.add(0,"Erdem");
        isimler.add(0,"Merve");
        isimler.add(3,"Dila");

        System.out.println(isimler);

        List<String>yeniListe=new ArrayList<>();

        yeniListe.add("Fırat");
        System.out.println(yeniListe);
        yeniListe.addAll(isimler);
        System.out.println(yeniListe);


        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(67);
        sayilar.add(8);

        sayilar.add(11);
  
        System.out.println(sayilar);
    }
}
