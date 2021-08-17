package day42;

public class Exceptions11 {
    public static void main(String[] args) {
        int []arr={34,35,41,63,21};

        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Hatalı index girişi");

        }
        finally{
            System.out.println("Önümüzdeki maçlara bakalım");
        }
    }
}
