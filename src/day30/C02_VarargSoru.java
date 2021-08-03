package day30;

public class C02_VarargSoru {
    public static void main(String[] args) {
        //Varargs kullanarak verilen Stringleri 
        //birlestiren concat isimli bir method olusturunuz

        
        cumleKur("Akif", "Emre", "Ayşe", "Mine", "Halide", "Dila");
    }
    
    private static void cumleKur(String... kelime) {
        String cumle="";
        for (String each : kelime) {
            cumle=cumle.concat(each)+" ";
        }

        System.out.println(cumle);

    }
}
