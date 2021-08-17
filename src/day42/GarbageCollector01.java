package day42;

public class GarbageCollector01 {
    public static void main(String[] args) {
        String str="";
        for (int i = 0; i < 3; i--) {
            str+=i;
            //sonsuz döngü içinde str variable
            // yeni atama ile her döngüde yeni bir str create
            // edilir
        }
    }
}
