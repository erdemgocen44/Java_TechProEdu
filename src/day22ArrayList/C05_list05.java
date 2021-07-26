package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_list05 {
    public static void main(String[] args) {
        List<Integer>fibonacci=new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);
        fibonacci.add(1);

        System.out.println(fibonacci);
        
        int sayi=0;
        int index=1;

       while(sayi<200){
           sayi=fibonacci.get(index)+fibonacci.get(index+1);
           if(sayi>=200){break;}
           fibonacci.add(sayi);
           index++;


       }
       System.out.println(fibonacci);
            
        }
    }

