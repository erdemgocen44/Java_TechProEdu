package day30;

public class C01_Varargs {
    public static void main(String[] args) {
        //verilen iki sayının toplamını veren bir method yazalım

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        
        ikiSayiTopla(sayi3, sayi1);
        ucSayiTopla(sayi3, sayi2, sayi1);
        topla(3,6,15,3,44,12);
    }

    private static void ucSayiTopla(int sayi1,int sayi2,int sayi3) {
        System.out.println("Uc sayının toplamı : "+(sayi1+sayi2+sayi3));
    }

    private static void ikiSayiTopla(int sayi1,int sayi2) {
        System.out.println("iki sayının toplamı : "+(sayi1+sayi2));

    }

    public static void topla(int... sayi) {
        int toplam=0;
        int count=0;
for (int each : sayi) {
    toplam+=each;
    count++;
    
    
}
System.out.println("Toplam "+count+" sayının toplamı : "+toplam);
        
    }
}
