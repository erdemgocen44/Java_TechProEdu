package day37.hastane;

public class Calisan extends Person {

  String egitimDurumu;
  double saatUcreti;
  int calismaSaati;

  public Calisan() {}

  public Calisan(
    String adi,
    String adres,
    String tel,
    int departmanId,
    String departmanAdi,
    String kisiAdi,
    String kisiAdres,
    int yas,
    String kisiTel,
    String egitimDurumu,
    double saatUcreti,
    int calismaSaati
  ) {
    super(
      adi,
      adres,
      tel,
      departmanId,
      departmanAdi,
      kisiAdi,
      kisiAdres,
      yas,
      kisiTel
    );
    this.egitimDurumu = egitimDurumu;
    this.saatUcreti = saatUcreti;
    this.calismaSaati = calismaSaati;
  }
}
