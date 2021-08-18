package day43.BankaUygulamasıMehmetHoca;

public class Run {

  public static void main(String[] args) {
    Person cm = new Customer(
      "Dila",
      "Istanbul ",
      "klasklj@gmail.com",
      "5246456",
      "23523452345"
    );
    System.out.println(cm.getAdi());
    Person emp = new Employe(
      "Akif",
      "Aydın",
      "asdfj@klsdf.com",
      "325",
      44.0,
      22
    );
    System.out.println(emp.getAdi());
    PersonalManager pm = new PersonalManager();
    pm.kisiEkle(cm);
    pm.kisiEkle(emp);
    pm.listele();
  }
}
