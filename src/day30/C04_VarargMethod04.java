package day30;

public class C04_VarargMethod04 {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 9 };

    System.out.println("Array toplam : "+arrTopla(arr));

    System.out.println("Varargs toplamı : "+varargsTopla(1, 3, 5, 7, 9));
    System.out.println("Varargs'ın array parametreli toplamı : "+varargsTopla(arr));
        //Vararg array gibi davrandığı için
        //herhangi bir arrayi parametrre olarak alabilir.
        
  }

  private static int varargsTopla(int... i) {
    int toplam = 0;
    for (int each : i) {
      toplam += each;
    }
    return toplam;
  }

  //Array elemanlarını toplayan method...
  private static int arrTopla(int[] arr) {
    int topla = 0;
    for (int each : arr) {
      topla += each;
    }

    return topla;
  }
  //varargs elemanlarını toplayan method

}
