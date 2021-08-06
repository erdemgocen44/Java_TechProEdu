package day32_StringBuilder;

public class C02_AccesModifier02 {

  public static void main(String[] args) {
    C02_AccesModifier01 obj1 = new C02_AccesModifier01();

    System.out.println(obj1.defaultAge);
    System.out.println(obj1.protectedAge);
    System.out.println(obj1.publicAge);

    C02_AccesModifier03 obj2=new C02_AccesModifier03();

    System.out.println(obj2.defaultName);
    System.out.println(obj2.protectedName);
    System.out.println(obj2.publicName);

  }
}
