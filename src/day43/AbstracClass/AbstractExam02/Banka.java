package day43.AbstracClass.AbstractExam02;

public abstract class Banka {

  double bakiye;

  public Banka(double bakiye) {
    this.bakiye = bakiye;
  }

  public Banka() {
    System.out.println("Hesap hareketleri ");
  }

  public abstract double paraYatir(double miktar);

  public abstract double paraCek(double miktar);
}
