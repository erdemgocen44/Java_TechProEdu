package day30;

public class C05_VarargsMethod05 {

  public static void main(String[] args) {

    //1) String Class’i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
	//StringBuilder class’i uretmistir.
	//2) Java’da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer clasi vardir.
	//“StringBuffer” Class’i StringBuilder Class’indan daha once uretilmistir.
	//“StringBuffer” yavas calisan bir class’dir, “StringBuilder” ise hizli calisir.
	//“StringBuffer” “synchronize” islemlerini yapabilir, ama “StringBuilder” yapamaz.
	//3) Ayni anda bir cok isin yapilmasina “multi threading” denir. “multi” = Cok, “thread”= Yapilan islerin herbiri
	//Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina “synchronization” denir.
    String s = "sabah nur";

    concat(s);

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("animal");
    StringBuilder sb3 = new StringBuilder(5);

    sb1.append("hay");

    sb1.append("va");

    sb1.append("n");

    System.out.println(sb1);
  }

  private static void concat(String s) {
    System.out.println(s + " dağtekin");
  }
}
