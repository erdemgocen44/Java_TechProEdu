package day49Maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        //Ad ve soyad bulunduran iki ayrı arrayi bir mape ekleyip yazdırınız
        //input:{"ahmet", "ahmet can","haluk"}; {"şeref","erdem","bilgin"}

        String ad[]={"ahmet", "ahmet can","haluk"};
        String soyad[]={"şeref","erdem","bilgin"};
HashMap <String,String>adSoyad=new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            adSoyad.put(ad[i],soyad[i]);
            
        }
System.out.print("Ad-Soyad : "+adSoyad);


    }
}
