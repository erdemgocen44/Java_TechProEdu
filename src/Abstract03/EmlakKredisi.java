package Abstract03;

public class EmlakKredisi extends BaseKredi{

    public EmlakKredisi(double istenilenPara) {
        super(istenilenPara);
    }

    @Override
    public void bilgiVer() {
        System.out.println(
            "Emlak krediniz başarı ile tanımlanmıştır\nÖdeyeceğiniz tutar " +
            krediHesapla()
          );        
    }

    @Override
    public double krediHesapla() {
        return getIstenilenPara()*110/100;
    }
    
}
