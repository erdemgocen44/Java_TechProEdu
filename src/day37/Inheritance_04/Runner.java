package day37.Inheritance_04;

public class Runner {

  public static void main(String[] args) {
    Cat c1 = new Cat();

	//aynı isimli variable lar call edilirken once obj kendi
	//classından sonra parentindeki variable call edilir
    System.out.println(c1.a); //animal
    System.out.println(c1.c); //kendi classından geldi. mammaldan değil
    System.out.println(c1.d); //kendi clasından geldi
    System.out.println(c1.m); //mammal

	c1.mM();
	c1.mC();
	c1.mA();

	Mammal c2=new Cat("XYZ");

	System.out.println(c2.a);
	System.out.println(c2.c);
	System.out.println(c2.m);

	c2.mA();
	c2.mC();
	c2.mM();

	Mammal m1=new Mammal();
	Animal c3=new Cat();

	System.out.println(m1.a);
	System.out.println(m1.c);
	System.out.println(m1.m);

	System.out.println(c3.a);
	System.out.println(c3.m);

  }
}
