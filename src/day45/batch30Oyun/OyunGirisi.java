package day45.batch30Oyun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OyunGirisi {

  static List<Integer> paraListesi = new ArrayList<>();

  public static void main(String[] args) {
    paraListesi.addAll(
      Arrays.asList(
        1,
        10,
        500,
        1000,
        5000,
        10000,
        50000,
        100000,
        250000,
        500000
      )
    );
    Collections.shuffle(paraListesi); //program her run edildiğinde belirtilen listteki elemanların yerini rastgele değiştirir.
  for (int i = 0; i <= 10; i++) {

    int kutuNo=i+1;
    Kutu kutu=new Kutu(kutuNo, paraListesi.get(i));
      
  }
}
}
