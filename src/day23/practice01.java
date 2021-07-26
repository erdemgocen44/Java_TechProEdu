package day23;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        //Amstrong sayı sayı rakamlarının küplerinin toplamı kendisini verecek
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen Amstrong olduğunu kontrol edeceğiniz sayıyı giriniz : ");

        int sayi=scan.nextInt();

        int ilkDeger=sayi;

        int rakam;

        int kuplerToplami=0;
        while(sayi!=0){
            rakam=sayi%10;
            sayi/=10;
            kuplerToplami+=rakam*rakam*rakam;
        }
        if(kuplerToplami==ilkDeger){
            System.out.println("Bravo Amstrong sayıyı elde ettiniz");
        }else{
            System.out.println("Malesef girdiğiniz sayı Amstrong sayı değil");
        }


    }
}
