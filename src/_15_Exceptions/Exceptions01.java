package _15_Exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullanicidan alinan  iki tam sayinin bolumlerini yazdiriniz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("bolunen tam  sayiyi giriniz :");
		int sayi1=scan.nextInt();
		
		System.out.print("bolen tam sayiyi giriniz : ");
		int sayi2=scan.nextInt();

		// System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);  exception verir

		// java exceptions lara handle etmek icin try-catch blogu olusturmus

	    
	    try {
	    	   System.out.println("bolme isleminin sonucu : " + sayi1/sayi2); //sorun cikmadgi surece calisacak kod blogu body
	    }catch (ArithmeticException  e) {   // try body'sinden gelebilecek muhtemel hata  ArithmeticException yazildi
	    									//ikaz lambasi yanarsa benzin al
											//ArithmeticException : Casting, conversion veya aritmetikte oluşan hatalardır.
								            // Bir sayının sıfıra bölünememesi ya da sonsuz negatif sayı olmaması gibi.
											// e ArithmeticException class obj ve data type
	    	
	    	    System.out.println("bolme isleminde bolen 0  olamazzzz");	    }
	}
}
