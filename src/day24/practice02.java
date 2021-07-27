package day24;

public class practice02 {
    public static void main(String[] args) {
       /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7} 
         * Output : 4
         */
        
        double toplam=0;
        int arr[]= {1,2,-10,4,8,56,3} ;
        for (int each : arr) {
            toplam+=each;
        }
        double ortalama=toplam/arr.length;
        System.out.println("arraydeki elemanlarin ortalamasi :"+ortalama);//4.0
        
        for (int k : arr) {
            if (k>ortalama) {
                System.out.println("arrayin ortalamadan buyuk elemanlari : "+k);
                
            }
            
        }
        
    }
}