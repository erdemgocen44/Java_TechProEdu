package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exception06 {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    System.out.println(arr[1]);
    System.out.println(arr[3]);
    System.out.println(arr[5]);

    List<String>gzlinsn=new ArrayList<>(Arrays.asList("Merve","Dila","Akif","Mine"));

    System.out.println(gzlinsn.get(2));
    System.out.println(gzlinsn.get(0));

    System.out.println(gzlinsn.get(5));

  }
}
