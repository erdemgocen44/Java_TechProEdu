package day33;

import java.util.Scanner;

public class DersOncesiCalisma {

  public static void main(String[] args) {
    /*
         * Kisisel Bilgi Sistemi
         * 
         * 1---> isiminiz giriniz ismi duzenleyip ilk harf buyuk olacak ve 
         * digerleri * olacak sekilde yazdiriniz... 
         * Girilen ismin palindrome olup olmadigini kontrol ediniz...
         * 
         * 2---> Soyisminizi giriniz... Soyismi duzenleyip ilk harf buyuk olacak ve
         * digerleri * olacak sekilde yazdiriniz...
         * 
         * 3---> Emailinizi @ kismina kadar giriniz 4 secenek olusturup şunları sorunuz..
         * Aşağıdaki e-posta adreslerinden uygun olanı seçiniz
         * 1-@gmail.com
         * 2-@hotmail.com
         * 3-@yahoo.com
         * 4-@yandex.com
         * 
         * Email ile e posta adresini concat yapiniz..
         * 
         * 4---> Sifre giriniz...
         * Lütfen aşağıdaki kriterlere uygun bir şifre seçiniz
         * 1-ilk harfi büyük olmalı
         * 2-son harfi küçük olmalı
         * 3-boşluk olmamalı
         * 4-8 karakterden az olmamalı
         * 
         * 5---> Kredi Karti numarinizi giriniz.. 
         * Bosluk birakmadan 16 hane olarak yazdirmasini isteyiniz
         * Console da ; **** **** **** 1234 Seklinde yazdiriniz..
         * 
         * 6---> Kisa bir aciklama giriniz.. 
         * isEmpty(), endsWith(), startsWith(), toLowerCase() 
         * methodlarini kullanarak yazdiriniz.. 
         * Girilen Aciklamayi tersten yazidiriniz..
         * 
         */
        Scanner scan = new Scanner(System.in);
        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("*********KİŞİSEL BİLGİ SİTEMİ*********");
            System.out.println("1-İsminizi Giriniz\n2-Soyadınızı Girinz\n3-Email Adresiniz Giriniz"
                    + "\n4-Şifrenizi Giriniz\n5-Kredi kartı Numarınızı Giriniz\n6-Kısa Bir Not Bırakınız\n7-Çıkış");
            System.out.print("Lütfen Bir Seçim yapınız : ");
            String secim = scan.nextLine();
            switch (secim) {
            case "1":
                System.out.println("Lütfen isminizi Giriniz : ");
                String isim = scan.nextLine();
                String duzenliIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
                System.out.println(duzenliIsim);
                String terstenIsim = "";
                for (int i = 0; i < isim.length(); i++) {
                    terstenIsim += isim.substring(isim.length() - 1 - i, isim.length() - i);
                }
                if (isim.equals(terstenIsim)) {
                    System.out.println("Girilen isim palindrome dur");
                } else {
                    System.out.println("Girilen isim palindrome değildir");
            }
                break;
            case "2":
                System.out.println("Lütfen isminizi Giriniz : ");
                String soyisim = scan.nextLine();
                String duzenliSoyIsim = soyisim.substring(0, 1).toUpperCase()
                        + soyisim.substring(1).replaceAll("\\w", "*");
                System.out.println(duzenliSoyIsim);
                break;
            case "3":
                System.out.println("Lütfen Emailinizi @ kısmına kadar giriniz :");
                String email = scan.nextLine();
                System.out.println("\nAşağıdaki e-posta adreslerinden uygun olanı seçiniz\n"
                        + "1-@gmail.com\n2-@hotmail.com\n3-@yahoo.com" + "\n4-@yandex.com");
                String ePosta = scan.nextLine();
                if (ePosta.equals("1")) {
                    System.out.println("@gmail.com");
                    System.out.println(email.concat("@gmail.com"));
                } else if (ePosta.equals("2")) {
                    System.out.println("@hotmail.com");
                    System.out.println(email.concat("@hotmail.com"));
                } else if (ePosta.equals("3")) {
                    System.out.println("@yahoo.com");
                    System.out.println(email.concat("@yahoo.com"));
                } else if (ePosta.equals("4")) {
                    System.out.println("@yandex.com");
                    System.out.println(email.concat("@yandex.com"));
                } else {
                    System.out.println("Hatalı işlem yaptınız");
                }
                break;
            case "4":
                System.out.println("\nLütfen aşağıdaki kriterlere uygun bir şifre seçiniz\n"
                        + "1-ilk harfi büyük olmalı\n2-son harfi küçük olmalı\n3-boşluk olmamalı" + "\n4-8 karakterden az olmamalı");
                String sifre=scan.nextLine();
                
                boolean ilkHarfKontrol=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
                boolean sonHarfKontrol=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
                boolean spaceKontrol=!sifre.contains(" ");
                boolean uzunlukKontrol=sifre.length()>=8;
                
                if (ilkHarfKontrol && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
                    System.out.println("Şifre başarı ile tamamlandı");
                }else {
                    System.out.println("İşlem başarısız.. Lütfen kriterlere uygun bir şifre giriniz...");
                }           
                break;
            case "5":
                System.out.println("Lütfen Kredi kartı numaranızı boşluk bırakmadan 16 hane olarak giriniz");
                String kkNo=scan.nextLine();
                String duzenliKart= "**** **** **** " + kkNo.substring(12);
                System.out.println(duzenliKart);
                break;
            case "6":
                System.out.println("Lütfen kısa bir açıklama giriniz");
                String acıklama=scan.nextLine();
                System.out.println(acıklama.isEmpty());
                System.out.println(acıklama.endsWith("."));
                System.out.println(acıklama.toLowerCase().startsWith("d"));
                
                // tersten yazdırmak istersek
                for (int i = acıklama.length()-1; i>=0; i--) {
                    System.out.print(acıklama.substring(i,i+1));
                }
                System.out.println("");
                break;
            case "7":
                System.out.println("Çıkış yapılıyor...İşleminiz Başarıyla gerçekleştrildi!!!");
                cikilsinMi = true;
                break;
            default:
                System.out.println("Uygun bir seçim yapmadnız. Tekrar giriş yapınız...");
                break;
            
}
}
        scan.close();
}
}