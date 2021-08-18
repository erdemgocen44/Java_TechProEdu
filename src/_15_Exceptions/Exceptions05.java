package _15_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions05 {

	public static void main(String[] args) {
		
	/*Eger kod creat edilirken  birden fazla exception durumu olusuyorsa
            Icice(nested) try-catch bloklari creat edilmeli
            Bu ornekte ilk once dosyayi okutmak istedik
            Java "Ya dosyayi bulamazsam? " diye bizden yardim istedi
            Biz de try-catch blogu ile FIleNOtFoundException ile handle etmesinde yardimci olduk
            Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam " 
            diye yardim istedi
            Biz de try-catch blogu ile IOException ile handle etmesini sagladik.
	 */
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\mehmetBulutluoz\\src\\TechProEd2021._01_JavaTechProEd.day39_exceptions\\File");
			int i=0;
			try {
				while ((i=fis.read()) !=-1) {
					System.out.print((char)i);  // (i) yi ((char)k) yapinca ascii degerleri yerine file yazdirildi
		
				}
			} catch (IOException e) {  // dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder
				// I= input  yazdirma
				// O= output  okutma
					
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());  
			}
		System.out.println("");
		System.out.println("Dewamkeee .....!!!!");


	}

}
