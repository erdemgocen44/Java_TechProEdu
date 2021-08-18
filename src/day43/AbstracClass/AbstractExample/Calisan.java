package day43.AbstracClass.AbstractExample;

public abstract class Calisan extends Insan {

  public Calisan(String isim, String soyisim, int calisanId) {
    super(isim, soyisim);
    this.calisanId = calisanId;
  }

  private int calisanId;

  @Override
  public void calis() {}
}
