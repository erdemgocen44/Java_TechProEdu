package day23;

import java.util.Scanner;


public class practice03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen taban ve üs giriniz");

        System.out.print("Taban giriniz : ");
        int sayi1=scan.nextInt();

        System.out.print("Üs giriniz : ");

        int sayi2=scan.nextInt();
        int sonuc=1;
        while(sayi2!=0){
          sonuc*=sayi1;
          sayi2--;

      }System.out.println("Girdiğiniz sayının üs kuvveti : "+sonuc);

      





        

    }
}
