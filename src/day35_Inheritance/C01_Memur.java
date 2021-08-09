package day35_Inheritance;

public class C01_Memur extends C01_Muhasebe {

  public static void main(String[] args) {
    C01_Memur memur1 = new C01_Memur();
    C01_Memur memur2 = new C01_Memur();

    memur1.isim = "Erdem";
    memur1.soyIsim = "Göçen";
    memur1.adres = "Falan Feş Mekan";
    memur1.saatUcreti = 20;
    memur1.statu = "Şef";
    memur1.tel = "41772094090";
    memur1.id = memur1.idAta();
    memur1.maas = memur1.maasHesapla();

    memur2.isim = "Merve";
    memur2.soyIsim = "İzgi";
    memur2.adres = "Falan Feş Mekan";
    memur2.saatUcreti = 25;
    memur2.statu = "Müdür";
    memur2.tel = "5464304384";
    memur2.id = memur1.idAta();
    memur2.maas = memur1.maasHesapla();

    System.out.println(
      "İsim : " +
      memur1.isim +
      "\nSoyisim : " +
      memur1.soyIsim +
      "\nAdres : " +
      memur1.adres +
      "\nSaat Ücreti : " +
      memur1.saatUcreti +
      "\nMaaş : " +
      memur1.maas
    );System.out.println("--------------*****************--------------");
    System.out.println(
      "İsim : " +
      memur2.isim +
      "\nSoyisim : " +
      memur2.soyIsim +
      "\nAdres : " +
      memur2.adres +
      "\nSaat Ücreti : " +
      memur2.saatUcreti +
      "\nMaaş : " +
      memur2.maas
    );
  }
}
