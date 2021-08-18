package day43.AbstracClass.AbstractExample;

public abstract class Insan {

  private String isim;
  private String soyisim;

  public Insan(String isim, String soyisim) {
    this.isim = isim;
    this.soyisim = soyisim;
  }

  public abstract void calis();

  public void bilgilendirme() {
    System.out.println("İsim : " + this.isim + " \nSoyisim : " + this.soyisim);
  }

  public void isimDegistir(String isim, String soyisim) {
    this.isim = isim;
    this.soyisim = soyisim;
  }
}
