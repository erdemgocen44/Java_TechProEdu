package day41.Inheritance03;

public class Hayvan {

  // -Hayvanların beslenme,barınma, boyut ve solunum özellikleri  ile ilgili methodlar barınıran Hayvan isminde bir class oluşturalım

  // -Hayvan sınıfının SubClassı bir Kuş Classı oluşturalım ve bu class ucma ve barınma methodlarını içersin

  // -Hayvan sınıfının SubClassı bir Balık Classı oluşturalım ve bu class yuzme ve Solunum methodlarını içersin

  // -kuş sınıfının SubClassı bir Güversin Classı oluşturalım ve bu class beslenme ve boyut methodlarını içersin

  // -Balık sınıfının SubCLassı bir JaponBaligi classı oluşturalım ve bu class solunum methodu içersin ve bu methodu Superclasstan alsın

  // --Runner class oluşturalım ve oluşturduğumuz methoları çağıralım.

  public void beslenme() {
    System.out.println("Hayvanlar beslenir");
  }

  public void barinma() {
    System.out.println("Hayvanlar barinir");
  }

  public void boyut() {
    System.out.println("Hayvanların bir boyutu vardir");
  }

  public void solunum() {
    System.out.println("Hayvanlar solunum yapar");
  }
}
