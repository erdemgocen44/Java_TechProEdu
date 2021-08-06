package day32_StringBuilder;

public class C01_StringBuilder01 {
    public static void main(String[] args) {
        String s ="hayat";
        StringBuilder sb=new StringBuilder("hayat");

        System.out.println(s.equals(sb));//false

        System.out.println(s.equals(sb.toString()));//true
        //string-string karşılaştırması
        System.out.println(sb.equals(sb.toString()));

        System.out.println(sb.toString().concat("güzel"));
        System.out.println(sb);
        System.out.println(sb.append(s));//sb ve s nin 2 ile 5 arasını appent et ekle
        
        
        
        
       

    }
}
