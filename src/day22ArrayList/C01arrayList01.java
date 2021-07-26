package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01arrayList01 {
    public static void main(String[] args) {
        short arr[]=new short [4];

        arr[0]=10;
        arr[1]=11;
        arr[2]=14;

        arr[3]=13;

        System.out.println(arr[1]);

        List<String>list3=new ArrayList<>();

        List <String>hayvan=new ArrayList<>();
        hayvan.add("kedi");
        hayvan.add("yılan");
        hayvan.add(1,"kartal");

        System.out.println(hayvan);
        hayvan.add(0,"sinek");
        System.out.println(hayvan);



        
    }
}
