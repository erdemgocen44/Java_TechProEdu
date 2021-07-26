package day23;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
        //belirli bir(kullanıcı girecek)  yükseklikten bir top serbest dusme ile bırakilımaktadir.
    // top serbest bırakıldıktan  sonra sürekli birakildigi yüksekliğin % 75 'İ kadar zeminden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde olay sonlandirilmaktadir.
    // Bu ana kadar topun toplam aldığı yolu ve topun zemine  vurma sayısını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakilacagi yuksekligi giriniz : ");
double birakilanYukseklik=scan.nextDouble();
double toplamYol=birakilanYukseklik;
int vurmaSayisi=0;
while (birakilanYukseklik>=1) {
    birakilanYukseklik*=3/4;
    toplamYol+=birakilanYukseklik*2;
    vurmaSayisi++;
}
System.out.println("topun zemine vurma sayisi :"+vurmaSayisi);
System.out.println("topu toplam aldidi yol  "+toplamYol);
        
    }





        
    }

