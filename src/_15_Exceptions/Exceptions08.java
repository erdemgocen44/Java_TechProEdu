package _15_Exceptions;

public class Exceptions08 {
    public static void main(String[] args) {


        String str1 = " ";
        String str2 = "";
        String str3 = null;  // null bir deger degildir. yazdirir
                             // sadece str3 un hicbir degere esit olmadigini belirten bir pointer(isaret)

        System.out.println(str1.length());   //1
        System.out.println(str2.length());   //0
        //System.out.println(str3.length());    // NullPointerException

        System.out.println(str3 + " bos");    //null bos
        System.out.println(str3.concat("bos"));   //NullPointerException (null string methodlarda calismaz)

        // null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapilirsa
        // Java NullPointerException (RTE :  Unchecked exception) verir

    }
}
