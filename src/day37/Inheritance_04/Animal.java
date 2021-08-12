package day37.Inheritance_04;

public class Animal {

 

  public void mA() {
    System.out.println("animal");
  }

  public void mM() {
    System.out.println("animal" + " mammal");
  }

  public int a = 7;
  public int m;
  public Animal() {
      System.out.println("Parametresiz animal constructor");
  }

  public Animal(int i) {
    System.out.println("int parametreli animal constructor");

  }
}
