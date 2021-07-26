package day23;

import java.util.Scanner;

public class practice09 {
    public static void main(String[] args) {
     // INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
     Scanner scan = new Scanner(System.in);
     System.out.print("PIN kodunuzu giriniz : ");
     int userPin = scan.nextInt();


     int pinCode = 1453;
while (pinCode!=userPin) {System.out.println("Başarısız pin girişi, tekrar deneyin");


userPin=scan.nextInt();
    
}System.out.println("Gayet başarılı giriş yaptınız");
 }
}