package day27;

import java.util.Scanner;

public class C03_PassByValue {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("Lütfen bir fiyat giriniz : ");
        double fiyat=scan.nextInt();

        indirimYap(fiyat);
    }

    public static double indirimYap(double fiyat) {

        System.out.println("Yeni fiyatınız : "+fiyat*90/100);

        return fiyat;
    }
}
