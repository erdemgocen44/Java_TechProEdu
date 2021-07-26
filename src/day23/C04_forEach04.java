package day23;

public class C04_forEach04 {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,1,23};

        int carpim=1;

        int count=1;

        for (int each : arr) {
            carpim*=each;
            count++;
        }
        System.out.println("Array'in elemanlarının çarpımı : "+carpim);
    }
}
