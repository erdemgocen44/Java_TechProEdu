package day28;

public class C04_ImmutableClasses02 {
    public static void main(String[] args) {
        String A="Ali";
        String B="Ali";
        String C=B+"";

//equals metodu sadece içeriğe bakar.İçerik hepsinde Ali 
//olduğu için equals iki satırda true döner.

        System.out.println(A.equals(B));
        System.out.println(A.equals(C));

        //  == hem içeriğe hemde referansa bakar
        //dolayısıyla A==C false döner.

        System.out.println(A==B);
        System.out.println(A==C);
    }
}
