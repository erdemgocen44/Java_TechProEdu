package day45.batch30Oyun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunGirisi {

  /*
	 1. Adım -->  10 farklı kutu olsun ve bu kutular farklı miktarlarda para içersin. 
	 				paraListesi isminde bir listte bunları tutalım...
	 				
	 2. Adım --> 10 tane kutu oluşturacağım. bu kutuların içerisine listte oluşturduğum para miktarlarını 
	 			rastgele bir şekilde atayacağım. Kutu isminde bir class oluşturalım. Oluşturduğumuz bu classta
	 			kutuNumarasi ve paraMiktari adında iki int tipinde değişken olmalı
	 			
	 3. Adım  --> yeni bir class oluşturalım. Kutular ismini verelim. kullanacağımız methodları burada oluşturalım.
	 
	 
	 4. Adım --> oyunu başlatalım, kullanıcıdan seçmek istediği kutu numarasını alalım, seçilen kutuyu var olan
	 kutuların içerisnden kaldırmamız gerek...
	 
	 		public void kutuEkle(Kutu kutu)
	 		public void kutuActir(int kutuNumarasi)
	 		public int kalanKutuSayisi()
	 		public int kutulardakiToplamParaMiktari()
	 		public void secilenKutuyuKutularListesindenKaldır()
	 		public void yapimcininTeklifiniAl()
	 		public String acilmamisKutularıGoster()	
	 		public void kaybedilenTutarlar()	
	 			 		 
	 
	 */

  static List<Integer> paraListesi = new ArrayList<>();
  static Kutular kutular = new Kutular();
  static Scanner scan = new Scanner(System.in);

  static int kutuNumaram;
  static int paraMiktarim;

  public static void main(String[] args) {
    paraListesi.addAll(
      Arrays.asList(
        1,
        10,
        500,
        1000,
        5000,
        10000,
        50000,
        100000,
        250000,
        500000
      )
    );
    Collections.shuffle(paraListesi); // belirtilen listteki elemanların yerini rastgele değiştirir.

    for (int i = 0; i < 10; i++) { // 0 1 2 3 4 5 6 7 8 9
      int kutuNo = i + 1; //   1 2 3 4 5 6 7 8 9 10
      Kutu kutu = new Kutu(kutuNo, paraListesi.get(i));
      kutular.kutuEkle(kutu);
    }

    System.out.println("oyunumuza hoşgeldiniz\nLütfen bir kutu seçin");
    kutuNumaram = scan.nextInt();
    paraMiktarim = paraListesi.get(kutuNumaram - 1);

    kutular.secilenKutuyuKutularListesindenKaldır(kutuNumaram);
    kutuSecmeActirma();
  }

  public static void kutuSecmeActirma() {
    System.out.println("kalan kutular : " + kutular.acilmamisKutulariGoster());
    System.out.println("hangi kutuyu açmak istersiniz.");
    int secim = scan.nextInt();
    kutular.kutuActir(secim);

    if (
      kutular.kalanKutuSayisi() == 7 ||
      kutular.kalanKutuSayisi() == 4 ||
      kutular.kalanKutuSayisi() == 1
    ) {
      System.out.println(
        "Teklifimiz : " + kutular.yapimcininTeklifiniAl(paraMiktarim)
      );
      System.out.println("teklifi kabul ediyor musun(1-Evet 2-Hayır");
      int yanit = scan.nextInt();
      if (yanit == 1) {
        System.out.println("oyun bitti");
        System.out.println(
          "kazanılan miktar= " + kutular.yapimcininTeklifiniAl(paraMiktarim)
        );
        System.out.println("kendi kutunuzdaki miktar: " + paraMiktarim);
      } else {
        kutuSecmeActirma();
      }
    } else {
      if (kutular.kalanKutuSayisi() > 0) {
        kutuSecmeActirma();
      } else {
        System.out.println("oyun bitti");
        System.out.println("kutunuzdakş miktar : " + paraMiktarim);
      }
    }
  }
}
