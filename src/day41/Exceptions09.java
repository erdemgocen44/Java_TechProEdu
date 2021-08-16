package day41;

import java.util.Scanner;

public class Exceptions09 {

  // Soru: Kullanicidan yasini girmesini isteyin.
  // Kodunuzu kullanici sifirdan kucuk bir sayi
  // girerse Exception verecek sekilde yazin.
  public static void main(String[] args) {
    // Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici 0' dan kucuk bir sayi girerse
    // Exception verecek sekilde yazin

    Scanner scan = new Scanner(System.in);

    System.out.print("Konsolda gormek icin yasinizi giriniz : ");

    int yas = scan.nextInt();

    /*
		 		 
		1. yol try-catch kullanmadan;
		 
		
		if (yas >= 0) {
			
			System.out.println("Yasiniz : " + yas);
			
		}
		
		else {
			
			throw new IllegalArgumentException(); // exceptions firlatir kod kirilir
​
		}
						
		System.out.println("Devamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
		
		*/

    // 2.yol try-catch ile;

    try {
      if (yas >= 0) {
        System.out.println("Yasiniz : " + yas);
      } else {
        throw new IllegalArgumentException(); // exceptions firlatir kod kirilmaz cunku try
        // body devam eder, catch calisir

      }
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }

    System.out.println(
      "Devamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur..."
    );
  }
}
