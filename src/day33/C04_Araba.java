package day33;

public class C04_Araba {

  //  1- filedları model(String), renk(String), motor(int), yil (int)
  //     olan Araba  isimli bir class tanımlayınız.
  //  2- bütün fieldları parametre alan bir constructor tanımlayınız.
  //  3- bütün fieldları için getter ve setter metodları oluşturunuz.
  //  4- ArabaMain isminde main için bir class oluşturunuz.
  //  5- İki adet parametreli const, 1 adet parametresiz cons ile 3 adet araba creat ediniz
  //  6- aracların motor ve yılını hatalı veri girisine karsi kapsulleyiniz.

  String model;
  String renk;
  private int motor;
  private int yil;

  public C04_Araba(String model, String renk, int motor, int yil) {
    this.model = model;
    this.renk = renk;
    this.motor = motor;
    this.yil = yil;
  }

  public C04_Araba() {}

  public int getMotor() {
    return motor;
  }

  public void setMotor(int motor) {
    if (motor < 0) {
      this.motor = -motor;
    } else this.motor = motor;
  }

  public int getYil() {
    return yil;
  }

  public void setYil(int yil) {
    if (yil < 0) {
      this.yil = -yil;
    } else this.yil = yil;
  }
}
