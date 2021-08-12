package day37.Inheritance_04;

public class Cat extends Mammal {

  public int c = 66;
  public int d = 55;

  Cat() {
    System.out.println("Parametresiz constructor");
  }

  Cat(String s) {
    this();
    System.out.println(super.c);
    System.out.println("String parametreli cat constructor");
  }

  public void mC() {
    System.out.println("cat");
  }
}
