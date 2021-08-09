package day35_Inheritance;

public class C01_Muhasebe extends C01_Personel{

  public int saatUcreti;
  public String statu;
  public int maas;

  public int maasHesapla() {
    maas = saatUcreti * 8 * 30;
    return maas;
  }
}
