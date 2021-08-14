package day38Overriding;

public class Dog extends Animal {

  //   Annotation-->>Mutlaka childe yazılır.
  //   Parent ile child arasında ilişki kurar.
  //   Annotation olmazda overriding olmaz.
  //   Overriding olması için @Override yazılmalı
  //Annotation=@ ile başlayan tüm kodlar annotation diye geçer
  @Override
  public void beslenme() {
    System.out.println("Kemik ile beslenir");
  }

  @Override
  public void tatli() {
    System.out.println("fıstık sarma");
  }

  @Override
  protected String icecek() {
    System.out.println("niğde gazozu");
    return "yarasın";
  }

  @Override
  public Integer topla() {
    return 41 + 54;
  }
  
}
