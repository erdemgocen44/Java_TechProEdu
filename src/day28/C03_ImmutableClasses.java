package day28;

public class C03_ImmutableClasses {

  public static void main(String[] args) {
    int sayi = 10;

    for (int i = 0; i < 10000; i++) {
      i++;
    }

    String str = "A";

    for (int i = 0; i < 10000; i++) {
      str += " ";
    }
  }
}
