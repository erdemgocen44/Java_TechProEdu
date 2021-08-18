package _15_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions13 {
    public static void main(String[] args) throws IOException {//
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\ASUS\\eclipse-workspace\\mehmetBulutluoz\\src\\TechProEd2021._01_JavaTechProEd.day39_exceptions");

        // try-catch blogu exception ile handle etmekde kullanilir
        // throws keyword'u ise sadece declaration'dir, dolayisla
        // throws kullanilan bir method'da exception olusursa KOD BLOKE OLUR

        int k = 0;

       while ((k = fis.read()) != -1) {
           System.out.println((char) k);
        }

        /*
         * Eger birden fazla throw keywordu kullanacaksak yazacagimiz exception'larin
         * arasindaki iliski ve siralama onemli olur. Eger yazdigimiz exceptionlar
         * arasinda Parent-Child iliskisi varsa once Child Exception yazilmalidir. Aksi
         * taktirde Child-Exception erisilemez olur.
         *
         *
         * Eger yazacaklarimiz arasinda Parent-Child iliskisi varsa istersek sadece
         * Parent'i yazmamiz da yeterli olur
         */

    }
}
