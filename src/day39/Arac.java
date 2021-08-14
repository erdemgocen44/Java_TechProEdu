package day39;

public class Arac {

  // 1) Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun
  // 2) Constructor ekleyiniz, get ve set methodlari ve toString Method' unu ekleyiniz
  // 3) Bu siniftan Otobus sinifini uretiniz, otobusun ayrica yolcuSayisi field' inin ekleyiniz.
  // 4) Bir AracPark isimli icinde main olan bir sinif olusturunuz ve Otobus' ten obj olusturarak,
  //    Otobus' un ozelliklerinin tumunu ekrana yazdiriniz.

  private String renk;
  private double motor;
  protected String model;

  public Arac(String renk, double motor, String model) {
    setRenk(renk);
    setMotor(motor);
    setModel(model);
  }

  public String getRenk() {
    return renk;
  }

  public void setRenk(String renk) {
    this.renk = renk;
  }

  public double getMotor() {
    return motor;
  }

  public void setMotor(double motor) {
    this.motor = motor;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
