package _15_Exceptions;

public class Exceptions14 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 8};

        try {//--> try deneme kontrol blogudur
            System.out.println(arr[20]);
        } catch (ArrayIndexOutOfBoundsException e) {//--> catch uyari handle blogudur.
            e.printStackTrace();
        } finally {//java
            System.out.println("dewamkeee okuduysan final blok run olmustur....");

            //try-catch  hata olacak ama olunca  catch deki gibi yap yoluna devam et code calissin
        }

        //soru try body sadece catch body ilemi calisir: hayır try body finally ile de calisir.
        // Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
        // Finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
        // ongoremedigim bir exception olustugunda da calisir.finally beklenmedik hata olsa bile mutlaka calis.
        // Finally block, her durumda calisir
        /*

       Finally block cloud veya database ile connection’i bitirme veya uzerinde
       calisilan dosyayi kapatma gibi islemler icin kullanilir.
       Finally block catch blogu olmadan sadece try ile de kullanilabilir.
       Bu durumda catch blogu olmadigindan Java throws exception ardindan finally ile istedigimiz islemi yapar
         */

    }


}

