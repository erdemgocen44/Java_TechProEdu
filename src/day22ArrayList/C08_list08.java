package day22ArrayList;

import java.util.Arrays;
import java.util.List;

public class C08_list08 {
    public static void main(String[] args) {
        String str[]={"Ali","Veli","Deli"};

        List<String>strList=Arrays.asList(str);

        System.out.println(strList);

        System.out.println("****************************");

        str[1]="Cafer";

        System.out.println(strList);
    }
}
