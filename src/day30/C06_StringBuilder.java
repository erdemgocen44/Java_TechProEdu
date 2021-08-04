package day30;

public class C06_StringBuilder {

  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder();

    //StringBuilder e eleman ekleme append ile yapılır

    sb1.append("Merve");
    System.out.println("sb1 ilk hali : " + sb1);
    sb1.append(" Dila");
    System.out.println("sb1 ikinci hali : " + sb1);
    sb1.append(" Göçtük yawww");
    System.out.println("sb1 son hali : " + sb1);
    System.out.println("sb1 uzunluk : " + sb1.length());
    System.out.println("sb1 kapasitesi : " + sb1.capacity());
    System.out.println("sb1 soon haliii : " + sb1.append(" bitsin artık"));
    System.out.println("sb1 son kapasitesi : " + sb1.capacity());



  }
}
