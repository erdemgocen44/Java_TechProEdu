package Encapsulation.Ornek2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciRun {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Ogrenci ogr1 = new Ogrenci();
    List<Ogrenci> bilgiler = new ArrayList();
    for (int i = 0; i < 3; i++) {
        System.out.print("Lütfen öğrenci adı giriniz : ");
        String isim = scan.nextLine();
        
        System.out.print("Lütfen öğrenci telefonu giriniz : ");
        String telefon = scan.nextLine();
        
        System.out.print("Lütfen numara giriniz : ");
        int numara = scan.nextInt();
        scan.nextLine();

      ogr1.setAd(isim);
      ogr1.setTelefon(telefon);
      ogr1.setNumara(numara);
      
      // Ogrenci ogr2 = new Ogrenci(isim, telefon, numara);
      bilgiler.add(ogr1);
    }

    System.out.println(bilgiler);
  }
}
