package day23;

import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");

        int sayi=scan.nextInt();
        rakamTopla(sayi);
int rakamlarToplami=0;
int rakam;
        while (sayi!=0) {
            rakam=sayi%10;
            sayi/=10;
            rakamlarToplami+=rakam;
            
           
        }
        System.out.println("Seçtiğiniz sayının s-rakamlar toplamı : "+rakamlarToplami);
    }

    public static void rakamTopla(int sayi) {

        int toplam=0;
        do {
            toplam+=sayi%10;
            sayi/=10;
        } while (sayi>0);
        System.out.println("Girdiğiniz sayının rakamlar toplamı :"+toplam);
    }
}
