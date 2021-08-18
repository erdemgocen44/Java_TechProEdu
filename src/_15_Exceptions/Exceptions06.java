package _15_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions06 {

	public static void main(String[] args) {
/*
         *  Icice try-catch yerine
            1 tane try ve multiple catch blogu kullanilabilir.
            Ancak bu durumda handle edilen exceptionlar arasinda Parent-Child iliskisi varsa
            Once child class'in exceptions'i handle edilmeli (yer degistirdik). once parent class'in exceptions'i handle edilirse
           hild class'in exceptions'i is kalmaz Java erisilemez catch-blogu diyerek CTE verir

        */
		
		try { //File bulmayi ve oktup yazdirmayi  dene
			FileInputStream fis = new FileInputStream( //file bul
					"C:\\Users\\ASUS\\eclipse-workspace\\mehmetBulutluoz\\src\\TechProEd2021._01_JavaTechProEd.day39_exceptions\\File");
			int k = 0;
			
				while ((k = fis.read()) != -1) { //file oku ve yazdir
					System.out.print((char) k);

				}
			} catch (FileNotFoundException e) {    // once child exception --> file bulma  handle edildi

				e.printStackTrace();
			
		} catch (IOException e) {   // sonra parent exception --> file okuma ve yazdirma  handle edildi

			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Dewamkeee .....!!!!");

	}

}
