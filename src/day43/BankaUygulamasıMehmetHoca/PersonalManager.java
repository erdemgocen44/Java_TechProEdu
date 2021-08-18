
package day43.BankaUygulamasıMehmetHoca;

import java.util.ArrayList;
import java.util.List;

public class PersonalManager {

  List<Person> kisiler = new ArrayList<>();

  public void kisiEkle(Person kisi) {
    kisiler.add(kisi);
  }

  public void listele() {
    for (Person person : kisiler) {
        System.out.println("");
      System.out.println(
        "Adı : " +
        person.getAdi() +
        "\n" +
        "Tel : " +
        person.getTel() +
        "\n" +
        "Adres : " +
        person.getAdres() +
        "\n" +
        "E-Mail : " +
        person.getEmail() +
        "\n"
      );
      if (person instanceof Customer) {
        System.out.println("IBAN : " + ((Customer) person).getIbanNo());
      }else if (person instanceof Employe) {
        System.out.println("Saat Ucreti : " + ((Employe) person).getSaatUcreti());
        System.out.println("Mesai Ucreti : " + ((Employe) person).getMesaiSaati());
        ((Employe) person).maasHesapla();

    }
  }
}}
