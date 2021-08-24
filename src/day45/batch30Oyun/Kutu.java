package day45.batch30Oyun;

public class Kutu {

  private int kutuNumarasi;
  private int paraMiktari;

  public Kutu(int sayi1, int sayi2) {
    this.setKutuNumarasi(sayi1);//sayi1kutu numarası
    this.setParaMiktari(sayi2);//sayi2 paraM,ktarı olacak
  }

public int getKutuNumarasi() {
    return kutuNumarasi;
}

public void setKutuNumarasi(int kutuNumarasi) {
    this.kutuNumarasi = kutuNumarasi;
}

public int getParaMiktari() {
    return paraMiktari;
}

public void setParaMiktari(int paraMiktari) {
    this.paraMiktari = paraMiktari;
}
}
