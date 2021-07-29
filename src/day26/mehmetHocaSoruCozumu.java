package day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mehmetHocaSoruCozumu {
    static Scanner scan=new Scanner(System.in);
    static List <String> isimler=new ArrayList<>();
    public static void main(String[] args) {
        isimler.add("Ali");
        isimler.add("Ahmet");
        menu();
    }
    private static void menu() {
        boolean cikilsinMi=false;
        while(!cikilsinMi) {
        System.out.println("Lütfen bir sayi seçiniz\n"
                + "1-Ekleme\n2-Sileme\n3-Güncelleme\n4-Listeleme\n5-SiraliListele\n6-Cikis");
        String islem=scan.nextLine();
        switch (islem) {
        case "1": ekle();
            break;
        case "2": sil();
        break;
        case "3": guncelle();
        break;
        case "4": listele();
        break;
        case "5": siraliListele();
        break;
        case "6":System.out.println("Cıkis yapiliyor");
        cikilsinMi=true;
        break;
        default:
            System.out.println("Uygun bir menü secmediniz");
            break;
        }
        }
    }
    private static void siraliListele() {
        Collections.sort(isimler);
        listele();
    }
    private static void listele() {
        //System.out.println(isimler);
        for (int i = 0; i < isimler.size(); i++) {
            System.out.println(i+1+"-"+isimler.get(i));
        }
    }
    private static void guncelle() {
        listele();
        System.out.println("Yukaridaki listeden güncelleme istediginiz elemanin numarasini giriniz");
        int siraNo=scan.nextInt();//\n
        scan.nextLine();
        System.out.println("Lütfen yeni isim giriniz");
        String yeniIsim=scan.nextLine();
        isimler.set(siraNo-1, yeniIsim);
    }
    private static void sil() {
        listele();
        System.out.println("Yukaridaki listeden silmek istediginiz elemanin numarasini giriniz");
        int siraNo=scan.nextInt();//\n
        String siraNo1=scan.nextLine();
        //int yeniSira=Intee
        scan.nextLine();
        isimler.remove(siraNo-1);
    }
    ///----------------------------------------->>>
    private static void ekle() {
        System.out.println("Girmek istediginiz ismi yaziniz");
        String isim=scan.nextLine();
        isimler.add(isim);
    }
}