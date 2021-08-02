package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_PassByValue02 {

  public static void main(String[] args) {
    /*Soru4 : Bir list ve bir array olusturalim 
ve eleman olarak 10,11,12 ekleyelim. 
Iki method olusturup list ve array’i degistirmeyi deneyelim
-1. Method’da array’e yeni bir array assign edelim ve 
yeni halini yazdiralim
-2. Method’da list’e yeni bir list assign edelim ve 
yeni halini yazdiralim
    */
    int arr[] = { 10, 11, 12 };
    System.out.println(Arrays.toString(arr));

    arrayiDegistir(arr);
    System.out.println(
      "arrayiDegistir çalıştıktan sonra main method içinde arr : " +
      Arrays.toString(arr)
    );

    List<Integer> sayiList = new ArrayList<>();

    sayiList.add(10);
    sayiList.add(11);
    sayiList.add(12);
    System.out.println("İlk oluşturduğumuz liste : " + sayiList);

    listiDegistir(sayiList);
    System.out.println(
      "listiDegistir methodu çalıştırdıktan sonra main method içinde list" +
      sayiList
    );
  }

  public static void listiDegistir(List<Integer> sayiList) {
    sayiList = new ArrayList<>();
    sayiList.add(50);
    System.out.println("Method içinde değişen List : " + sayiList);
  }

  public static void arrayiDegistir(int[] arr) {
    arr = new int[4];
    arr[0] = 15;
    arr[1] = 25;
    arr[2] = 35;
    arr[3] = 45;

    System.out.println(Arrays.toString(arr));
  }
}
