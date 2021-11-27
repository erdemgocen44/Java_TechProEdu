package _JavaStudy._99_JavaProjects.OkulYonetimi;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {
   // BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.
//
//	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
//		Kayıtlarda şu bilgiler olabilmelidir.
//
//		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
//		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
//
//	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
//		Aşağıdaki gibi bir menü gösterilsin.
//
//	====================================
//	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
//	====================================
//	 1- ÖĞRENCİ İŞLEMLERİ
//	 2- ÖĞRETMEN İŞLEMLERİ
//	 Q- ÇIKIŞ
//
//	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
//
//	============= İŞLEMLER =============
//		 1-EKLEME
//		 2-ARAMA
//		 3-LİSTELEME
//		 4-SİLME
//		 5-ANA MENÜ
//		 Q-ÇIKIŞ
//
//	SEÇİMİNİZ:
//
//	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
//	    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
//		Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.


         String kisiTuru;   // buna static yazarsak running classında obje oluşturmadan class ismiyle direk çağırabiliriz
         int ogrenciNo = 1002;
         int ogretmenNo = 2000;
         Scanner scan = new Scanner(System.in);
         HashMap<Integer, Ogrenci> ogrenciListesi = new HashMap<>();
         HashMap<Integer, Ogretmen> ogretmenListesi = new HashMap<>();



         public  void anaMenu() {
            System.out.println("====================================");
            System.out.println(" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
            System.out.println("====================================");
            System.out.println("LÜTFEN İŞLEM YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ :\n1- ÖĞRENCİ İŞLEMLERİ\n2- ÖĞRETMEN İŞLEMLERİ\nQ- ÇIKIŞ");

             String secim = scan.next().toUpperCase();

            if (secim.equals("Q")) {
                cikis();
            } else if (secim.equals("1")) {
                kisiTuru = "OGRENCI";
                islemMenusu();

            } else if (secim.equals("2")) {
                kisiTuru = "OGRETMEN";
                islemMenusu();

            } else {
                System.out.println("Yanlış giriş yaptınız..");
                anaMenu();
            } }
        private  void cikis() {System.out.println("Programı kullandığınız için teşekkürler..");
        }
        private  void islemMenusu() {

            System.out.println("============= İŞLEMLER =============");
            System.out.println("1-EKLEME\n2-ARAMA\n3-LİSTELEME\n4-SİLME\n5-ANA MENÜ\nQ-ÇIKIŞ\n");
            System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: ");
            String tercih = scan.next().toUpperCase();
            switch (tercih) {
                case "1":
                    ekle();
                    break;
                case "2":
                    ara();
                    break;
                case "3":
                    listele();
                    break;
                case "4":
                    sil();
                    break;
                case "5":
                    anaMenu();
                    break;
                case "Q":
                    cikis();
                    break;
                default:
                {System.out.println("Hatalı seçim yaptınız.");
                    islemMenusu();}
                break;
            }
        }
        //===================================================================================
        private  void sil() { // return type a gerek yok map ler kaydoluyor
            System.out.println("------------- " + kisiTuru + " SİLME SAYFASI ----------------"); //sonra yaz
            if (kisiTuru.equals("OGRENCI")) {
                System.out.println("Silmek istediginiz öğrencinin (1000 ile başlayan)ogrenciNo sunu giriniz");
                int ogrenciNoo = scan.nextInt();
                if (ogrenciListesi.containsKey(ogrenciNoo)) {
                    ogrenciListesi.remove(ogrenciNoo);
                    System.out.println(ogrenciNoo+"nolu öğrenci silinmiştir");
                    System.out.println("YENİ LİSTE\n"+ogrenciListesi);} //bu şart değil görmek için

                else System.out.println(ogrenciNoo + " numaralı öğrenci bulunamadı");}

            else {System.out.println("Silmek istediginiz (1000 ile başlayan)öğretmenin ogretmenNo sunu giriniz");
                int ogretmenNoo = scan.nextInt();
                if (ogretmenListesi.containsKey(ogretmenNoo)) {
                    ogretmenListesi.remove(ogretmenNoo);
                    System.out.println(ogretmenNoo+"nolu öğretmen silinmiştir");
                    System.out.println("YENİ LİSTE\n"+ogretmenListesi);}
                else System.out.println(ogretmenNoo + " numaralı öğretmen bulunamadı");}

            islemMenusu();
        }
        //=====================================================================================
        private  void ara() {     // return type a gerek yok map ler kaydoluyor
            System.out.println("------------- " + kisiTuru + " ARAMA SAYFASI ----------------");

            if (kisiTuru.equals("OGRENCI")){
                System.out.println("Aramak istediginiz öğrencinin (1000 ile başlayan ) ogrenciNo sunu giriniz");
                int ogrenciN = scan.nextInt();

                if (ogrenciListesi.containsKey(ogrenciN)) {
                    System.out.println(ogrenciListesi.get(ogrenciN));}
                else System.out.println(ogrenciN + " numaralı öğrenci bulunamadı");}

            else {System.out.println("Aramak istediginiz öğretmenin (1000 ile başlayan) ogretmenNo sunu giriniz");
                int ogretmenN = scan.nextInt();
                if (ogretmenListesi.containsKey(ogretmenN)) {
                    System.out.println(ogretmenListesi.get(ogretmenN));} else {
                    System.out.println(ogretmenN + " numaralı öğretmen bulunamadı");
                }}
            islemMenusu();
        }
        //============================================================================
        private  void ekle() {
            System.out.println("------------- " + kisiTuru + " EKLEME SAYFASI ----------------");
          //  Scanner scan =new Scanner(System.in);  //buraya tekrar yazmayınca scan leri birleştiriyor, bos scan.nextLine eklenmeli
            System.out.println("Ad Soyad Giriniz:");
            String adSoyad = scan.nextLine();
            scan.nextLine(); //işte bu gerekiyor ***************
            System.out.println("Kimlik No Giriniz:");
            String kimlikNo = scan.next();
            System.out.println("Yaşınızı Giriniz:");
            int yas = scan.nextInt();

            if(kisiTuru.equals("OGRENCI")){
                System.out.println("Numaranızı giriniz:");
                String numara = scan.next();
                System.out.println("Sınıf giriniz:");
                String sinif = scan.next();

                //  Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
                //mesela, Map string,string olsaydı cons oluşturmadan direk ogrencilistesi.put(100,"ali") yazabilirdik

                ogrenciListesi.put(ogrenciNo++,new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif));

                // System.out.println(ogrenciNo +" no'lu "+ogrenciListesi.get(ogrenciNo) +" isimli öğrenci listeye eklenmiştir");
               //listeyi yazdırırsak numara atıo o yüzden burada yazmıyoruz, gerekirse listele yaparız
            }else {
                System.out.println("Sicil No giriniz:");
                String sicilNo = scan.next();
                System.out.println("Bölüm giriniz:");
                String bolum = scan.next();

                ogretmenListesi.put(ogretmenNo++,new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo));
            }
            islemMenusu(); }

        //==================================================================================
        private  void listele() {

        if (kisiTuru.equals("OGRENCI"))

          System.out.println(ogrenciListesi);

      else
           System.out.println(ogretmenListesi);
            islemMenusu();
        }
//========================================================================================
        public void topluListe()  {  //return type a gerek yok collection ve map ler içine kaydediyor
            //burada yazdırmıyoruz proje çalıştığında ilk etapta gözükmesin diye,

            //Ogrenci ogrenci1=new Ogrenci("Ali Can","11111",14,"111","fen");
            ogrenciListesi.put(ogrenciNo++,new Ogrenci("Ali Can","11111",14,"111","fen"));
            //mesela, Map string,string olsaydı cons oluşturmadan direk ogrencilistesi.put(100,"ali") yazabilirdik

            ogrenciListesi.put(ogrenciNo++,new Ogrenci("Veli Han","2222",14,"222","sos"));

                ogretmenListesi.put(ogretmenNo++,new Ogretmen("İpek Bilir","1212",34,"mat","1212"));

}}

