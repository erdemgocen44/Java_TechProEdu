package day44.Interface;

public class Sahin extends Tofas implements IcDonanim ,Lastik{

  @Override
  public void ebat() {
System.out.println("16 inc lastik ebatı vardır.");    
  }

  @Override
  public void jant() {
    System.out.println("Çelik jant kullanılmıştır");    
    
  }

  @Override
  public void ayna() {
    System.out.println("elektrikli aynalar");
  }

  @Override
  public void kapi() {
    System.out.println("4 kapılı");
  }

  @Override
  public void kaporta() {
    System.out.println("kordon gibi kaportaya sahip");
  }

  @Override
  public void koltuk() {
    System.out.println("deri koltuk yazin pişirir....");
  }

  @Override
  public void motor() {
    System.out.println("1.6 aile motoru");
  }

  @Override
  public void yakit() {
    System.out.println("tup takmazsan daha çokkkkk yakar");
  }
}
