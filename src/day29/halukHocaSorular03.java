package day29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class halukHocaSorular03 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    System.out.println("Lütfen listeniz için sayı giriniz");
    System.out.println("Ssayı girişini bitirmek için 'q' harfi giriniz");
    int toplam = 0;
    String islem = "";

    while (!islem.equalsIgnoreCase("q")) {
      System.out.print("Lütfen sayı giriniz : ");
      islem = scan.nextLine();
      list.add(islem);
    }
    list.remove(list.size() - 1);
    for (String w : list) {
      int a = Integer.parseInt(w);
      toplam += a * a;
    }
    System.out.println(
      list + " nın elemanlarının kareleri toplamı : " + toplam
    );
  }
}
