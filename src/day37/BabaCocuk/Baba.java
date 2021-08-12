package day37.BabaCocuk;

public class Baba {

  String adi;
  String gozRengi;
  String sacSekli;

  public Baba(String adi, String gozRengi, String sacSekli) {
    this.adi = adi;
    this.gozRengi = gozRengi;
    this.sacSekli = sacSekli;
  }

  public Baba() {}

  public void konusur() {
    System.out.println(this.adi + " yürür");
  }

  public void yurur() {
    System.out.println(this.adi + " konusur");
  }
}
