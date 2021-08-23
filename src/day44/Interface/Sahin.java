package day44.Interface;

public class Sahin extends Tofas implements IcDonanim, DisDonanim {

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
