package day23;

public class C07_Runner {
    public static void main(String[] args) {
        C06 obj1 = new C06();

        obj1.isim = "Mehmet Textil";

        obj1.telefon = "5057190327";
        System.out.println("İşyeri ismi  : " + obj1.isim + ", \nTelefon      : " + obj1.telefon);

        System.out.println(obj1.isciSayisi);

        C06 obj2 = new C06();

        obj2.isciSayisi = 50;
        obj2.isciSayisi += 3;

        obj2.isciSayisi -= 10;

        System.out.println(obj2.isciSayisi);
        System.out.println(obj1.isciSayisi);

    }
}
