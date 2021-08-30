package Encapsulation.Ornek2;

public class Ogrenci {

  private String ad;
  private String telefon;
  private int numara;

  public Ogrenci(String ad, String telefon, int numara) {
    this.ad = ad;
    this.telefon = telefon;
    this.numara = numara;
  }

  public Ogrenci() {}



  @Override
public String toString() {
    return "Ogrenci [ad=" + ad + ", numara=" + numara + ", telefon=" + telefon + "]";
}

public String getAd() {
    return ad;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }

  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }

  public int getNumara() {
    return numara;
  }

  public void setNumara(int numara) {
    this.numara = numara;
  }
}
