package day33;

public class C03_ArabaMain {

  public static void main(String[] args) {
    C04_Araba volvo = new C04_Araba("XC90  ", "Beyaz", 3000, 2020);
    C04_Araba honda = new C04_Araba("Civic  ", "Siyah", 1600, 2019);
    C04_Araba nissan = new C04_Araba(){};
    honda.model="accord";
    honda.renk="gri";
    honda.setYil(1999);
    honda.setMotor(1400);

    System.out.println("Honda nın yılı : "+honda.getYil());
    System.out.println("Honda nın motoru : "+honda.getMotor());

    System.out.println(volvo.getMotor());



  }
}
