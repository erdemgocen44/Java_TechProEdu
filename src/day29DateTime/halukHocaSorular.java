package day29DateTime;

import java.util.ArrayList;
import java.util.List;

public class halukHocaSorular {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>(
      List.of("Ali", "Veli", "Ayşe", "Fatma", "Omer")
    );
    List<String> yeniList = new ArrayList<>();

    for (String w : list1) {
      if (w.toLowerCase().contains("a")) {
        continue;
      } else {
        yeniList.add(w);
      }
    }System.out.println(yeniList);
  }
}
