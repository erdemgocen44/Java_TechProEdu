package Abstract03;

public abstract class BaseKredi {
    private double istenilenPara;
    
   public BaseKredi(double istenilenPara) {
        this.istenilenPara = istenilenPara;
    }
public abstract double krediHesapla();
   public abstract void bilgiVer();
public double getIstenilenPara() {
    return istenilenPara;
}
public void setIstenilenPara(double istenilenPara) {
    this.istenilenPara = istenilenPara;
}
    
}
