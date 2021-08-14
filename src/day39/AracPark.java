package day39;

public class AracPark extends Arac {

  public AracPark(String renk, double motor, String model) {
    super(renk, motor, model);
    //TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    Otobus obj = new Otobus("Kırmızı", 5000, "Om470");
    System.out.println("Faruk turizm : "+obj);
  }
}
