package day28;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue {

  public static void main(String[] args) {
    List<Integer> sayiList = new ArrayList<>();

    sayiList.add(10);
    sayiList.add(11);
    sayiList.add(12);
    System.out.println("İlk oluşturduğumuz liste " + sayiList);

    forLoopIleArtir(sayiList);
    System.out.println("forloop methodundan sonra list : "+sayiList);

    setIleArtir(sayiList);

    System.out.println("set methodundan sonra main method içinde list : "+sayiList);


    
  }
  

  public static void setIleArtir(List<Integer> sayiList) {
      for (int i = 0; i < sayiList.size();i++) {
          sayiList.set(i, sayiList.get(i)+5);
      }
      System.out.println("set metodu içinde artırımdan sonra sayiList : "+sayiList);

}

public static void forLoopIleArtir(List<Integer> sayiList) {
    System.out.println("ForEach ile artırdığımız elementler : ");
    for (Integer each : sayiList) {
      each += 5;

      System.out.print(each + " ");
    }
    System.out.println("");
    System.out.println("ForEach Loop dan sonra list : " + sayiList);
  }
}
