package Encapsulation.Ornek1;

public class Ana {

  private String ad = "Mervem";
  private int yas = 36;
  String adres="Adana";


@Override
public String toString() {
    return "Ana [ad=" + ad + ", adres=" + adres + ", yas=" + yas + "]";
}
public Ana(){};
  public Ana(String ad, int yas,String adres) {
    this.ad = ad;
    this.yas = yas;
    this.adres=adres;
}


public void setAd(String ad) {
    this.ad = ad;
}
public void setYas(int yas) {
    this.yas = yas;
}
public String getAd() {
    return ad;
  }

  public int getYas() {
    return yas;
  }
}
