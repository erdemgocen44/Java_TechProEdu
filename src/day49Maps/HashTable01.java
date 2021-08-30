package day49Maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
1) HashMap ve TreeMap sychoronized ve therad safe değildir
Mapler arasından synchoronized ve thread safe olan bir map e ihtiya. vardır
Bu yüzden HashTable oluşturulmuştur

2) HashTable ne key için ne de value için null değer alamaz

3)HashTable elemanları rastgele sıralar

    */
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"feridun");
        ht.put(102,"samet");
        ht.put(103,"ipek");
        ht.put(104,"İPEK");
        ht.put(105,"harun");

        System.out.println(ht);//{105=harun, 104=İPEK, 103=ipek, 102=samet, 101=feridun}

       // ht.put(null, "ali");//hashtable lar null değer alamaz exception fırlatır





    }
}
