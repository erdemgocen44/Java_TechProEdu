package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_list07 {
    public static void main(String[] args) {
        int sayi1=0;
        int sayi2=1;
        int sayi3=sayi1+sayi2;
        
     int count=0;
     List<Integer>istenenSayilar=new ArrayList<>();
    do {
            
        sayi1=sayi2;
        sayi2=sayi3;
        sayi3=sayi1+sayi2;
        if(sayi3>100){
            istenenSayilar.add(sayi3);
            count++;
        }
     } while (count<20);

System.out.println("******* 100 den büyük fibonacci sayıları : "+istenenSayilar+"******");
        
    }
}