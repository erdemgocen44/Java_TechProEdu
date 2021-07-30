package day27;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class kuraCekme {

  public static void main(String[] args) {
    List<String> isimler = new ArrayList<>();
    List<String>secilenler=new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    System.out.print(
      "Lütfen aramak istediğiniz isimleri arasına','koyarak yazınız : "
    );

    String isim = scan.nextLine();
    System.out.print("Kaç isim seçmek istiyorsunuz?? : ");
    int kacIsim = scan.nextInt();
    Random rnd = new Random();

    String isimBolme[] = isim.split(",");
    //  System.out.println(Arrays.toString(isimBolme));

    isimler.addAll(Arrays.asList(isimBolme));
    boolean ciftIsimControl = ciftControliVarMi(isimler);
    int i = 0;
    int rastgeleIndex;
    boolean tekrarControl;
    String secilenIsim;
    if (ciftIsimControl) {
      if (kacIsim <= isimler.size()) {
        while (i < kacIsim) {
          rastgeleIndex = rnd.nextInt(isimler.size());
          secilenIsim=isimler.get(rastgeleIndex);
          tekrarControl=rastgeleIsimTekrariVarMi();
if(!tekrarControl){
    secilenler.add(secilenIsim);
}
          //System.out.println(isimler.get(rastgeleIndex));
          i++;
        }
      }
    }
  }

  public static boolean rastgeleIsimTekrariVarMi() {
    

    return false;
}

public static boolean ciftControliVarMi(List<String> isimler) {
    List<String> yeniIsimler = new ArrayList<>();
    for (String each : isimler) {
      if (!yeniIsimler.contains(each)) {
        yeniIsimler.add(each);
      }
    }
    if (yeniIsimler.size() == isimler.size()) {
      return false;
    } else {
      return true;
    }
  }
}
