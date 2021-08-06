package SatisStokSistemi;

public class Siparis {

  Musteri musteri;
  Urun urun;
  int miktar;

  public Siparis() {}

  public Siparis(Musteri musteri, Urun urun, int miktar) {
    this.musteri = musteri;
    this.urun = urun;
    this.miktar = miktar;
  }

  public void faturaYaz() {
    System.out.println(
      "Alışveriş için teşekkürler " +
      musteri.adi +
      ". \nFaturanız aşağıda özetlenmiştir :\n" +
      miktar +
      " tane " +
      urun.fiyat +
      " liradan alınan ürün için toplam faturanız : " +
      urun.fiyat *
      miktar
    );
    System.out.println(
      "Faturanız aşağıdaki adrese gönderilcektir : \n" + musteri.adres
    );
  }
}
