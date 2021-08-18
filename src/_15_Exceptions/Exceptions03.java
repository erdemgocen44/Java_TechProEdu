package _15_Exceptions;

import java.util.Scanner;

public class Exceptions03 {

    public static void main(String[] args) {

        // iki tam sayinin bolumlerini yazdiriniz

        int sayi1 = 18;
        int sayi2 = 6;
/*
		javaya Exceptions'i (checked-->CTE)  handle edilmezse pr (stops execution) uygulamayi durdurur.
		throws an exception (Exceptions firlatir) handle icin problemi  gosterir.

 */
        try {
            System.out.println("bolme isleminin sonucu : " + sayi1 / sayi2);
        } catch (ArithmeticException e) {
            System.out.println("bolen 0 olamazzz...");//1-->Bizim kullaniciye vrrdigimiz mesaj handle

            System.out.println(e);//2-->java.lang.ArithmeticException: / by zero

            //handle için  hatanin yazdirilmasi...Tedavi teshise tabidir...

            System.out.println(e.getMessage());//3--> / by zero  //daha az aciklama yazdirir.

            e.printStackTrace();/*4-->hatanin tum verilerini verir.syso gerek yok zaten method voidp
             * java.lang.ArithmeticException: / by zero
             * at NewDay/TechProEd2021._01_JavaTechProEd.day38_exceptions.Exceptions03.main(Exceptions03.java:14)
             */
        }
        System.out.println("dewamkeeee");
    }
}


