package _15_Exceptions;

public class Exceptions10 {
    public static void main(String[] args) {


        int sayi = 35;
        // String str=sayi; // CTE-->checked

        String str = "1453";//tc okul nosu gibi

        System.out.println(str + 35); // concat--> 145335

        int strSayi = Integer.parseInt(str);

        System.out.println(strSayi + 35); // 1488
        System.out.println(str + 20); // 12345620

        String str2 = "145a3";
        //System.out.println(Integer.parseInt(str2)); // RTE--> NumberFormatException
        // Eger tamamen sayilardan olusmayan bir String'i int'a cevirmeye
        // calisirsaniz Java NumberFormatException verir

        Object sayi2 = 45;
        String sayiStr = (String) sayi2;   // Explicit narrowing casting --> RTE ClassCastException

        // Data turlerini casting yaparken uygun olmayan islem yapilirsa
        // Java ClassCastException verir


    }
}
