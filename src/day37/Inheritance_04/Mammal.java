package day37.Inheritance_04;

public class Mammal extends Animal {

  public int c = 7;
  public int m = 4;

  public void mA() {
    System.out.println("mammal");
  }

  public void mC() {
    System.out.println("cat" + " mammal");
  }

  public Mammal() {
    this('g');
    System.out.println("Parametresiz mammal constructor");
  }

  public Mammal(char c) {
    super(34);
    System.out.println("char parametreli constructor");
  }
}
