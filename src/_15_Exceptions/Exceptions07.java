package _15_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions07 {

	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		Eger handle edilecek exception'lar arasinda parent-child iliskisi varsa
       sadece parent class'in exceptions'in creat edip child class'in  exception catch blogu olamdan da kod calisir
        Child exception'i olmadan sadece Parent Exceptions varsa:
        pozitif yani : tek catch blogu ile tum exceptionlar handle edilebilir
        negatif yonu : bir hata ile karsilasindiginda hatanin turu(dosya bulunamadigi icin mi
        yoksa dosya okunamadigi icin mi) ve verisi  anlasilamaz
		 */
		
		
		try {
			FileInputStream fis = new FileInputStream(
					"/Users/yeni/IdeaProjects/Summer2021Practice/src/_15_Exceptions/file");
			int k = 0;
			
				while ((k = fis.read()) != -1) {
					System.out.print((char) k);
					fis.close();
				}	
		} catch (IOException e) {   //parent exception--> IOException, child exception-->FileNotFoundException

			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Dewamkeee .....!!!!");




	}
	

}
