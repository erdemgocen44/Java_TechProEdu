package day49Maps;

import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) TreeMap Maplerin en yavaşıdır
    
    2)TreeMaplerde keyler için null kullanılamaz

    3)TreeMaplerde valueler için null istenildiği kadar kullanılabilir

    4)TreeMapler sycronized ve therad safe değildirler
        */
    public static void main(String[] args) {
        TreeMap <Integer,String>tm=new TreeMap<>();

        tm.put(101, "aladdin");
        tm.put(102, "salih");
        tm.put(103, "berk");
        tm.put(104, "süleyman");
        tm.put(105, "ebikgabık");

        System.out.println(tm);//{101=aladdin, 102=salih, 103=berk, 104=süleyman, 105=ebikgabık}

        tm.put(186, null);
        System.out.println(tm);//{101=aladdin, 102=salih, 103=berk, 104=süleyman, 105=ebikgabık, 186=null}
        System.out.println(tm.ceilingKey(111));//null
        System.out.println(tm.ceilingEntry(100));//ceillingEntry methodu istenen key değerini(100) ve kendisinden büyük küçük key olmadığı için 101 return eder
        System.out.println(tm.floorKey(111));//florrKey methodu istenen key değerini(111) ve kendisinden büyük en küçük key olmadığı için 106 return eder
System.out.println(tm.keySet());//keyleri artan sıralama ile dizer

System.out.println(tm.headMap(103));//{101=aladdin, 102=salih} girdiğimiz key hariç oncekileri map olarak verir

        
    }
}
