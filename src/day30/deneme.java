package day30;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Kaç elemanlı bir liste yapmak istiyorsunuz : ");

    int boyut = scan.nextInt();
    String isim[] = new String[boyut];
    List<String> isimler = new ArrayList<>();

    
while (!isimler.contains("a")) {
    continue;
    
}

    for (int i = 0; i < isim.length; i++) {
        System.out.println("Arrayinizin " + i + " elamnını giriniz");
        isimler.add(scan.nextLine().toLowerCase());
    }
if(!isimler.contains("a")){
    
}else{
    System.out.println(isimler);
}


  }
}
