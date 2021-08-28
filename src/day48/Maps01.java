package day48;

import java.util.HashMap;

public class Maps01 {

  public static void main(String[] args) {
    HashMap<Integer, String> mp1 = new HashMap<>();

    mp1.put(101, "Levent");
    mp1.put(102, "Said");
    mp1.put(103, "Hasan");
    mp1.put(104, "Canan");
    mp1.put(105, "Ayşe");

    System.out.println(mp1); //{101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayşe}

    mp1.put(101, "Harun"); //key value uptade eder,eski veri üzerine yazar

    System.out.println(mp1); //{101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayşe}

    System.out.println(mp1.put(106, "Canan")); //aynı value farklı keye atanabilir

    System.out.println(mp1); //{101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayşe, 106=Canan}

    System.out.println(mp1.put(null, "Haluk")); //key değeri null olabilir

    System.out.println(mp1); //{null=Haluk, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayşe, 106=Canan}

    System.out.println(mp1.put(null, "Hakan")); //null değerini uptade eder

    mp1.put(107, "null");
    mp1.put(108, "null");
    mp1.put(109, "null");
    System.out.println(mp1); //{null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayşe, 106=Canan, 107=null, 108=null, 109=null}

    System.out.println(mp1.get(103)); //Hasan
    System.out.println(mp1.values()); //Mapteki tüm elemanların sadece value lerini getirir[Hakan, Harun, Said, Hasan, Canan, Ayşe, Canan, null, null, null]

    System.out.println(mp1.keySet()); //Mapteki tüm elemanların sadece key lerini getirir[null, 101, 102, 103, 104, 105, 106, 107, 108, 109]

    System.out.println(mp1.getOrDefault(111, "Böyle bir eleman yoktur"));//Böyle bir eleman yoktur
    System.out.println(mp1.getOrDefault(105, "Böyle bir eleman yoktur"));//Ayşe
    
    System.out.println(mp1.putIfAbsent(110, "Ahmet"));//null==>belirtilen keyde value yoksa verilen value yi ekler.

    System.out.println(mp1);//{null=Hakan, 101=Harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayşe, 106=Canan, 107=null, 108=null, 109=null, 110=Ahmet}


}
  }
  
