package day41.Inheritance02;

public class Runner {

  public static void main(String[] args) {
    myMethod();
  }

  public static void myMethod() {
    SubClass subC = new SubClass();

    System.out.println(subC.num);

    subC.goster();
    Super superC = new Super();

    System.out.println("SuperClass degisken degeri : " + superC.num);
    superC.goster();
  }
}
