package day37.BabaCocuk;

public class Cocuk extends Baba {

  String okul;

  public Cocuk(String adi, String gozRengi, String sacSekli, String okul) {
    super(adi, gozRengi, sacSekli);
    this.okul = okul;
  }

  public Cocuk() {}

  public Cocuk(String okul) {
    super();
    this.okul = okul;
  }

  public void sporYap() {
    System.out.println(this.adi + " spor yapar");
  }
}
