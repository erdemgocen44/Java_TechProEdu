package day24;

import java.util.Arrays;

public class practice01 {
    public static void main(String[] args) {
       
        // multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
        // birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
        // yazdıran programı yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
        /*
         * 0. kat-->10,20,30
         * 1. kat-->4
         * 2. kat-->6,7,20
         */
        
        int apt[][] = { { 1, 20, 30 }, { 4 ,13}, { 6, -7, 20 } };
        
        int sonuc[] = new int[apt.length];
        
        for (int kat = 0; kat < apt.length; kat++) {//katlara  girme donfudsu
            
            for (int daire = 0; daire < apt[kat].length; daire++) {//dairelere girme dongusu
                sonuc[kat]+=apt[kat][daire];
            }
            
        }
        System.out.println(Arrays.toString(sonuc));
    }
}




