package day44.Interface;

public class SahinRunner {

  public static void main(String[] args) {
    Sahin sahin = new Sahin();

    sahin.ayna();
    sahin.ebat();
    sahin.jant();
    sahin.kapi();
    sahin.kaporta();
    sahin.koltuk();
    sahin.motor();
    sahin.sunroof();
    sahin.yakit();
    System.out.println("Şahinlerde music : " + IcDonanim.music);
    System.out.println("Şahinlerde koltuklar : " + IcDonanim.kumas);
    System.out.println("Şahinlerde iç donanım : " + IcDonanim.RENK); //ahsap
    System.out.println("Şahinlerde kaporta : " + DisDonanim.RENK); //metalik
    System.out.println("Şahinlerde Lastikler : " + Lastik.RENK); //siyah-beyaz yanaklı
  }
}
