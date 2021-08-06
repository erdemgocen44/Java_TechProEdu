package day32_StringBuilder;

public class C01_StringBuilderSoru {

  public static void main(String[] args) {
    //Bir cümleyi parametre olarak kabul eden,
    //StringBuilder kullanarak cümleyi ters çeviren 
    //ve cümlenin palindrom
    //olup olmadığını kontrol eden 
    //(büyük/küçük harf duyarlılığı olmadan) 
    //bir Java programı yazın.
    //(without case sensitivity)
    //Eg : input : I love Java
    //Output: "Reversed sentence : avaJ evol I .
    //It is not a palindrome"

    String str = "tras neden sart";

    StringBuilder sB = new StringBuilder();

    sB.append(str);

    String tersString = sB.reverse().toString();

    if (str.equalsIgnoreCase(str)) {
      System.out.println("Girdiginiz cumle polindrome' dur ===> " + tersString);
    } else {
      System.out.println("Girdiginiz cumle polindrome degildir " + tersString);
    }
  }
}
