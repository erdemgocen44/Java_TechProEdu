package _15_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions04 {

    public static void main(String[] args) {

        // java ya bir dosyayi okumasi veya dosyaya yazmas�n� soyledi�imizde
        // java "Ya dosyay� bulamazsam" der ve bizden c�z�m uretmemizi bekler
        // dosya bulma ile ilgili excaption turu : FileNotExcaption
        // java kodu yazar yazmaz buradaki olas� problem� g�rur ve CTE verir
        // kodumuzu yedi�imiz anda ortaya ��kan bu tur exception lara Checked Exceptions diyoruz
        //

        try {
            FileInputStream fis = new FileInputStream("Users/yeni/eclipse-workspace/summer2021Practice/src/_14_Exceptions/file");

        } catch (FileNotFoundException e) {

            //e.printStackTrace(); // tum hata ac�klamalar�n� yazd�r�r ama kodumuzu bloke olmaz syso içine almalımıyım hsyır cunku kod void
            System.out.println(e.getMessage());  // daha az hata aciklamas� yazd�r�r.
        }
        System.out.println("Dewamkeee .....!!!!");//yazmadan calıstır.

    }
}
