package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_list03 {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();
        
        isimler.add("Ali");
        isimler.add("Ayse");
        isimler.add("Zeki");
        System.out.println(isimler);

        isimler.set(1, "Miniş");

        System.out.println(isimler);

        System.out.println(isimler.set(2, "Dila"));

        System.out.println(isimler);

    }
}
