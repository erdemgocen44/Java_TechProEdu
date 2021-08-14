package day39;

public class Otobus extends Arac {

    int yolcuSayisi;
  public Otobus(String renk, double motor, String model) {
        super(renk, motor, model);
        //TODO Auto-generated constructor stub
    }
@Override
public String toString() {
    return "Otobus [yolcuSayisi=" + yolcuSayisi + "]";
}

}
