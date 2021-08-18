package day43.BankaUygulamasıMehmetHoca;

public class Person {

  private String adi;
  private String adres;
  private String email;
  private String tel;
  public Person (){}

  public Person(String adi, String adres, String email, String tel) {
    this.setAdi(adi);
    this.setAdres(adres);
    this.setEmail(email);
    this.setTel(tel);
  }

  public String getAdi() {
    return adi;
  }

  public void setAdi(String adi) {
    this.adi = adi;
  }

  public String getAdres() {
    return adres;
  }

  public void setAdres(String adres) {
    this.adres = adres;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }
}
