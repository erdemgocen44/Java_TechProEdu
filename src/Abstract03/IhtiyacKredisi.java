package Abstract03;

public class IhtiyacKredisi extends BaseKredi {

  public IhtiyacKredisi(double istenilenPara) {
    super(istenilenPara);
  }

  @Override
  public void bilgiVer() {
    System.out.println(
      "İhtiyaç krediniz başarı ile tanımlanmıştır\nÖdeyeceğiniz tutar " +
      krediHesapla()
    );
  }

  @Override
  public double krediHesapla() {
    return getIstenilenPara() * 105 / 100;
  }
}
