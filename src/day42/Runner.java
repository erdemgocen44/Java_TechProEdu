package day42;

import java.util.Scanner;

public class Runner {

  public static void main(String[] args) throws EyJavaBuHatayiOgrenExceptionsu {
    Scanner scan = new Scanner(System.in);
    System.out.print("Email adresinizi giriniz : ");
    String email = scan.nextLine();

    if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
      System.out.println("Başarılı giriş");
    } else {
      throw new EyJavaBuHatayiOgrenExceptionsu(
        "Neyin kafası bu, ne içtiysen bana da ver"
      );
    }
  }
}
