package day43.BankaUygulamasıMehmetHoca;

public class Employe extends Person {

  private double saatUcreti;
  private int mesaiSaati;

  public Employe() {}

  public Employe(
    String adi,
    String adres,
    String email,
    String tel,
    double saatUcreti,
    int mesaiSaati
  ) {
    super(adi, adres, email, tel);
    this.setSaatUcreti(saatUcreti);
    this.setMesaiSaati(mesaiSaati);
  }

  public void maasHesapla() {
    System.out.println("Maas : " + this.getMesaiSaati() * this.getSaatUcreti());
  }

  public double getSaatUcreti() {
    return saatUcreti;
  }

  public void setSaatUcreti(double saatUcreti) {
    this.saatUcreti = saatUcreti;
  }

  public int getMesaiSaati() {
    return mesaiSaati;
  }

  public void setMesaiSaati(int mesaiSaati) {
    this.mesaiSaati = mesaiSaati;
  }
}
