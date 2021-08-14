package day38Overriding;

public class Animal {

  public void beslenme() {
    System.out.println("Tüm hayvanlar beslenir");
  }

  public void tatli() {
    System.out.println("trileçe");
  }
  protected String icecek() {
    System.out.println("turşu suyu");
    return "ohh mis";
  }
  public Integer topla() {
      return 34+6;
      
  }
}
