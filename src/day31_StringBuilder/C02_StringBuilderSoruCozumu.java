package day31_StringBuilder;

import java.time.LocalTime;

public class C02_StringBuilderSoruCozumu {

  public static void main(String[] args) {
    // 1000 kere donecek bir loop yazalim
    // loop'da String ve StringBuilder kullanip
    // oncesinde ve sonrasinda zaman alalim
    // hizlarini karsilastiralim

    String  s="";
    StringBuilder sb1=new StringBuilder();
    System.out.println("String öncesi zaman : "+LocalTime.now());
    

    for (int i = 0; i <=1000; i++) {
        s+=i;
    
    }System.out.println(s);
    System.out.println("Loop sonrası zaman : "+LocalTime.now());
    for (int i = 0; i <=1000; i++) {
        sb1.append(i);
        
    }
    System.out.println(sb1);
    
  }
}
