package day44.Interface;

public interface DisDonanim {
  public void ayna();

  public void kapi();

  public void kaporta();

  String RENK = "metalik";

  public default String sisLamp() {
    return "sisli hava dikkat";
  }
  public static String boya() {
    return "koyu renk gunes yanığı yapar";
  }
}
