package day35_Inheritance;

public class C01_Personel {

  public static int sayac = 1000;
  public int id;
  public String isim;
  public String soyIsim;
  public String adres;
  public String tel;

  public int idAta() {
    this.id = sayac++;
    
    return id;
  }
}
