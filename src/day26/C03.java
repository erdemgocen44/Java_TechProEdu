package day26;

public class C03 {

  static int sayi = 15;

  static int count=0;

  String str = "Java";

  public static void main(String[] args) {
    /*
		 bir method veya variable'i static yapmanin avantaji :
		 
		 Static variable ve method'lara her yerden ulasmak istedigimizde classIsmi.methodIsmi yazmamiz
		 yeterli olur
		 
		 Ornegin array'lerde kullandigimiz Arrays class'i altindaki Arrays.toString() method'u static olarak
		 Java developer'lari tarafindan hazirlanmis oldugu icin
		 Arrays.toString() yazarak method'u rahatlikla kullanabiliyoruz
		 
		 Ancak variable'lari static yapmak biraz riskli
		 Mesela bir okul uygulamasinda okul ismini static variable olarak olusturursak
		 avantaj olarak her yerden rahatlikla okul ismine ulasabiliriz
		 
		 ama ogrenci objelerinden veya ogretmen objelerinden biri uzerinden okul adi degistirilirse
		 tum ogrenciler be tum ogretenler icin okul adi kalici olarak degismis olur 
		 ve bu da bir uygulama icin istenmeyen durumdur
		 
		 */
    sayi = 20;

    //str="static olan main methoddan instance variable a ulaşamazsın";

    staticMethod();

    System.out.println(C01.sayi2);


    C03 obj1=new C03();
    C03 obj2=new C03();

    obj1.increment();
    obj2.increment();

    System.out.println("Obj1 : count is= "+obj1.count);
    System.out.println("Obj2 : count is= "+obj2.count);
    
  }

  private void increment() {
      count++;
}

public static void staticMethod() {
    System.out.println("Static method çalıştı");
  }

  public void staticOlmayanMethod() {
    System.out.println("Static olmayan method çalıştı");
  }
}
