package day41.Inheritance04;

import day37.hastane.Calisan;

public class Yonetici extends Calisan{

    public Yonetici(String isim,int maas,String departman) {
        
        super(isim,maas,departman);
        
    }
    
    public void zamMiktari(int zam) {
        
        System.out.println("yapilacak zam mikhtarı :"+zam);
    }
}