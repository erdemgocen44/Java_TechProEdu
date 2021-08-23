package day44.practice.KitapTakibi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KitapBilgileri {

  /*
	 --her kitaba ait kitapNo,kitapAdi,yazarAdi kitapFiyati olmali
	 bu bilgileri listlerde tutalim
	 */
  static List<Integer> kitapNo = new ArrayList();
  static List<String> kitapAdi = new ArrayList();
  static List<String> yazarAdi = new ArrayList();
  static List<Double> kitapFiyati = new ArrayList();

  static Scanner scan = new Scanner(System.in);
  int counter = 1003;
  String cevap;

  static {
    kitapNo.addAll(Arrays.asList(1000, 1001, 1002));
    kitapAdi.addAll(Arrays.asList("calikusu", "sinekli bakkal", "1984"));
    yazarAdi.addAll(Arrays.asList("Resat nuri", "halide edip", "george orwel"));
    kitapFiyati.addAll(Arrays.asList(20.0, 25.0, 15.0));
  }

  public String kitapEkle() {
    do {
      System.out.println("=============KITAP BILGILERI===============");

      System.out.println("Kitap adi giriniz : ");
      cevap = scan.next();
      String kitap = scan.nextLine();

      kitapAdi.add(kitap);

      System.out.println("yazar giriniz : ");
      String yazar = scan.nextLine();
      yazarAdi.add(yazar);

      System.out.println("kitabın fiyatını giriniz");
      double fiyat = scan.nextDouble();
      kitapFiyati.add(fiyat);
      scan.nextLine();
      kitapNo.add(counter++);

      System.out.println("KITAP NO\tKITAP ADI\tYAZAR ADI\tKITAPFIYATI");
      System.out.println("---------------------------------------------");
      System.out.println(
        counter + "\t\t" + kitap + "\t\t" + yazar + "\t\t" + fiyat
      );
      System.out.println("-----------------------------------------");

      System.out.println("kitabı basarı ile kaydettiniz");
      System.out.println("başka kayıt yapmak istiyor musunuz: (E/H)");
    } while (cevap.equalsIgnoreCase("e"));

    System.out.println("Ana menuye ulaşmak için bir tuşa basın");

    return scan.next();
  }

  public String noIleGoruntule() {
    do {
      System.out.println(
        "goruntulemek istediginiz kitabin numarasini giriniz..."
      );
      int numara = scan.nextInt();

      for (int i = 0; i < kitapNo.size(); i++) {
        if (numara == kitapNo.get(i)) {
          System.out.println(
            kitapNo.get(i) +
            " " +
            kitapAdi.get(i) +
            " " +
            yazarAdi.get(i) +
            " " +
            kitapFiyati.get(i)
          );
        }
      }
      System.out.println("devam etmek istiyor musunuz (e/h)");
      cevap = scan.next();
    } while (cevap.equalsIgnoreCase("e"));

    System.out.println("Ana menuye ulaşmak için bir tuşa basın");

    return scan.next();
  }

  public String bilgiIleGoruntule() {
    do {
      int flag = 0;
      System.out.println(
        "icerisinde hangi ifadenin gectigi kayitlari goruntulemek istiyorsunuz"
      );
      String ifade = scan.nextLine();

      for (int i = 0; i < kitapNo.size(); i++) {
        if (
          kitapAdi.get(i).contains(ifade) || yazarAdi.get(i).contains(ifade)
        ) {
          System.out.println(
            kitapNo.get(i) +
            " " +
            kitapAdi.get(i) +
            " " +
            yazarAdi.get(i) +
            " " +
            kitapFiyati.get(i)
          );
          flag = 1;
        }
      }

      if (flag == 1) {
        System.out.println("arama kriterlerinize uyan tum kayitlar listelendi");
      } else {
        System.out.println("arama kriterinize uygun kayit yoktur");
      }
      flag=0;

      System.out.println("devam etmek istiyor musunuz(E/H)");
      cevap = scan.nextLine();
    } while (cevap.equalsIgnoreCase("e"));

    System.out.println("Ana menuye ulaşmak için bir tuşa basın");
    return scan.next();
  }
  public String silme() {
Scanner scan=new Scanner(System.in);
System.out.print("Silmek istediğiniz kayıt no giriniz : ");
int kayit=scan.nextInt();
int i=0;
for (i = 0; i < kitapNo.size(); i++) {
  if(kayit==kitapNo.get(i)){

break;
  }
}
kitapNo.remove(i);
kitapAdi.remove(i);
yazarAdi.remove(i);
kitapFiyati.remove(i);

    return scan.next();

    
  }
}
