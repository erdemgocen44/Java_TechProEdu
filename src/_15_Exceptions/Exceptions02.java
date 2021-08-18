package _15_Exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

		// kullanicidan alinan  iki tam sayinin bolumlerini yazdiriniz
		
		
		int count=1;
    	Scanner scan = new Scanner(System.in);
    	
    	while(count<=10) {

			System.out.print("bolunen tam  sayiyi giriniz :");
			int sayi1=scan.nextInt();

			System.out.print("bolen tam sayiyi giriniz : ");
			int sayi2=scan.nextInt();
/*
		javaya Exceptions'i (checked-->CTE)  handle edilmezse pr (stops execution) uygulamayi durdurur.
		throws an exception (Exceptions firlatir) handle icin problemi  gosterir.
 */
		
		System.out.println("islem no :"+ count ); //count yazdirildi
		try{ System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);
		}catch (ArithmeticException e) {

			System.out.println("bolen 0 olamazzz...");//1-->Bizim kullaniciye vrrdigimiz mesaj handle

		}
		count++;
		 }
	}

}
