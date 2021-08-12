package day37.BabaCocuk;

public class mainFamily {

  public static void main(String[] args) {
    Baba baba = new Baba();
    baba.adi = "Erdem";
    baba.gozRengi = "Kahverengi";
    baba.sacSekli = "Kıvırcık";
    Cocuk cocuk = new Cocuk();
    cocuk.adi = "Akif Emre";
    cocuk.gozRengi = "Siyah";
    cocuk.sacSekli = "Düz";
    cocuk.okul = "Yıldız Teknik";

    cocuk.konusur();
    baba.yurur();
    cocuk.sporYap();
    Cocuk c = new Cocuk("Salih", "Mavi", "Kıvırcık", "Sakarya Uni");
  }
}
