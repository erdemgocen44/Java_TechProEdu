package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_list06 {
    public static void main(String[] args) {
        List<Integer>fibonacci=new ArrayList<>();
        List <Integer>istenenSayilar=new ArrayList<>();


        fibonacci.add(0);
        fibonacci.add(1);

        int count =1;
        int sayi=0;
        int i=1;

        do {sayi=fibonacci.get(i-1)+fibonacci.get(i);
            fibonacci.add(sayi);

            if(sayi>100){
                istenenSayilar.add(sayi);
                count++;
                
            }
            i++;
            
        } while (count<=20);
System.out.println("100 den büyük istenen sayılar : "+istenenSayilar);
System.out.println("---------------------------------------");

System.out.println("Fibonacci sayıları : "+fibonacci);
   

      

     
    
    }
}
