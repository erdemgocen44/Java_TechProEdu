package day34Encapsulation;

import java.util.Scanner;

public class C02_BookMain {
    public static void main(String[] args) {
        
//     Book class'ı verilmiştir.
//     İki tane attributes oluşturunuz.
//     bookName ve authorName (String ile)
//     Book class'ını kapsülleyin. (Encapsulate)
//     Main class'ın içine object  oluşturun ve sonucu yazdırınız.
C01_Book book=new C01_Book(null, null);
Scanner scan=new Scanner(System.in);

System.out.print("Lütfen kitabınızın ismini giriniz : ");
String bookName=scan.nextLine();
book.setBookName("Çalıkuşu");
System.out.print("Lütfen yazarın ismini giriniz : ");
String authorName=scan.nextLine();
book.setBookName(bookName);
book.setAuthorName(authorName);

System.out.println("kitabım "+book.getBookName()+" yazarın adı : "+book.getAuthorName());


    }
}
