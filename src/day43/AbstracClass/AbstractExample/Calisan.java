package day43.AbstracClass.AbstractExample;

public class Calisan extends Insan {
    
    
    private int calisanId;
    public Calisan(String isim, String soyisim,int calisanId) {
        super(isim, soyisim);
        this.calisanId=calisanId;
    }
    @Override
    public void calis() {
        
        if (calisanId==0) {
            System.out.println("bu sahis sirket calisani degil");
            System.out.println("sahsin id'si : "+calisanId);
            
        }else {
            System.out.println("bu sahis bizim gundiii :)");
            System.out.println("sahsin id'si : "+calisanId);
        }
    } public static void main(String[] args) {
         
        Calisan ITManager= new Calisan("Merve","Aslan", 0);
        Calisan QAtester= new Calisan("Omer","Farulk", 1453);
        Calisan Developer= new Calisan("Oguzhan ","Akkafa", 1905);
        
        ITManager.bilgilendirme();
        ITManager.calis();
        
        
        QAtester.bilgilendirme();
        QAtester.calis();
        
        Developer.bilgilendirme();
        Developer.calis();
        
        
    }
}