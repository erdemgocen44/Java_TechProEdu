package day41;

public class Exceptions07 {

  public static void main(String[] args) {
    int sayi = 34;
    String str = "1453";
    //String str1=sayi;//CTE -->>checkid exceptions ClassCast hatası

    int okulNo=Integer.parseInt(str);
    System.out.println(okulNo);
    System.out.println(str+35);
    System.out.println(okulNo+35);
    String str1="14a3";

    int strSayi=Integer.parseInt(str1);//NumberfORMATeXCEPTIONS
    

    //UNchecked-->>(r)UNchecked

    Object sayi3=45;
    String strSayi2=(String)sayi3;//data Type class casting ;yan büyük veri kücük konteynıra atandı
    //ClasCastExceptions hatası alırız



  }
}
