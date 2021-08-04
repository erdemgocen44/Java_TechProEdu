package day31_StringBuilder;

import java.util.Arrays;

public class C01_StringBUilder01 {

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
    //fazladan ayrılan kapasiteyi silme-->>obj.trimToSize
    sb1.trimToSize();
    System.out.println(sb1.capacity());
    //istenen karakterin index ini alma -->> obj.indexOf();
    System.out.println(sb1.indexOf("e")); //1
    System.out.println(sb1.lastIndexOf("e")); //4
    //istenen bir karakteri indexine göre alma-->>obj.charAt();
    System.out.println("SB in 7. karakteri : " + sb1.charAt(7));
    //belirli bir aralıktaki characterleri alma-->>obj.subSequence();
    System.out.println(
      "Belirli karakterler arasını yazdırma : " + sb1.subSequence(4, 8)
    );

    System.out.println(
      "Belirli karakterden sonrasını yazdırma 1 : " +
      sb1.subSequence(11, sb1.length())
    );

    System.out.println(
      "Belirli karakterden sonrasını yazdırma 2 : " +
      sb1.toString().substring(11)
    );

    //SB deki belli index deki karakteri silme-->>obj.delete();

    System.out.println("Belli indexdeki karakteri silme : " + sb1.delete(3, 9));
    System.out.println(
      "Sadece tek bir karakteri silme : " + sb1.deleteCharAt(0)
    ); //sb1.delete(2,3) bu da tek karakteri siler.

    System.out.println("sb1 in son hali : " + sb1); //Yapılan işlemlerin tamamı kalıcıdır..

    //istenen index istenen karakteri ve karakterleri
    //eklemek-->>obj.insert(index,char);
    //insert metodunda sadece String değil
    //diğer karakter çeşitlerini de alır...
    //hatta Array de alır

    System.out.println(sb1.insert(0, "Merve Dila "));

    int arr[] = { 17, 63, 21 };

    System.out.println(
      "sb1 in 9.karakterinden itibaren arr Arrayi ekledik : " +
      sb1.insert(9, Arrays.toString(arr))
    );

    //istenen indexdeki characterin yerine birden fazla
    //character eklemeobj.replace(a,b,"character");

  StringBuilder sb2=new StringBuilder("Bugün hava çok sıcak");
  System.out.println(sb2);
  sb2.replace(3, 8, "xxxxxxxxxxx");//3 dahil 8 hariç karakerlerin arasını silip x leri yazdı.
  //3 dahil 8 hariç index arasına verilen sadece bir x
  //değeri olursa stringi atar, 
  //ama atanacak string kısa atanan index 
  //uzun olursa kalan indexteki karakterleri siler.


  System.out.println("Son hali : "+sb2);

  System.out.println("özel durum : "+sb2.insert(5, "BAŞARILI", 2,5));
  /*
  * 5:sb2 ye BAŞARILI ekleme başlangıç indexi
  * BAŞARILI: eklenecek string değer
  * 2: eklenecek stringin başlangıç indexi->dahil
  * 5: eklenecek stringin bitiş indexi->hariç
  */

//reverse metodu-->>obj.reverse();
//sb elemanlarını indexe göre ters çevirir.

System.out.println("sb2 objesinin ters hali : "+sb2.reverse());

StringBuilder sb3=new StringBuilder("Bugün hava çok sıcak");







  }
}
