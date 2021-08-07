package day34Encapsulation;

import java.util.Scanner;

public class C03_EmployeesMain {

  public static void main(String[] args) {
    /* TODO
    Burada iki adet class vardır. Biri Main diğeri ise Employees,
    Employees(Çalışanlar) class'ında;
    Bu variable'ları oluşturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.
 Main class'ın içinde; kullanicidan name dob ve slary bilgilerini alip
    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
  Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
*/
    Scanner scan = new Scanner(System.in);

    System.out.print("Lütfen adınızı giriniz : ");
    String name = scan.nextLine();

    System.out.print("Lütfen doğum tarihinizi MM/dd/yyyy şeklinde giriniz : ");
    String dob = scan.nextLine();

    System.out.print("Lütfen talep ettiğiniz maaşı giriniz : ");
    int salary = scan.nextInt();

    C03_Employees calisan = new C03_Employees();
    calisan.setDob(dob);
    calisan.setName(name);
    calisan.setSalary(salary);
    int calisanYas = calisan.yasHesapla(dob);
    if (calisanYas > 18) {
      System.out.println(
        "Welcome to our compony " +
        calisan.getName() +
        " your salary : " +
        calisan.getSalary()
      );
    } else if (calisanYas < 18) {
      System.out.println("Büyü de gel çocuğum");
    } else if (calisanYas == 18) {
      System.out.println("We have inter that you can " + salary);
    }
  }
}
