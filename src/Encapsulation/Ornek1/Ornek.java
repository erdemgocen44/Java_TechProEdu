package Encapsulation.Ornek1;

import java.util.Scanner;

public class Ornek {

  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
    Ana obj = new Ana();
    System.out.println(obj.getAd());
    System.out.println(obj.getYas());
    System.out.println(obj.adres);

    System.out.print("Ad giriniz : ");
    obj.setAd(scan.nextLine());

    System.out.print("Yaş giriniz : ");
    obj.setYas(scan.nextInt());

    
    Ana obj2=new Ana("Ali",25,"Mersin");
    System.out.println(obj2.getAd());
    System.out.println(obj2.getYas());
    System.out.println(obj2.adres);

    System.out.println(obj.getAd());
    System.out.println(obj.getYas());

    System.out.println(obj.toString());

  }
}
 