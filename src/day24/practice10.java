package day24;

import java.util.Arrays;

public class practice10 {
    public static void main(String[] args) {

        //$ ve £ işaretli paraları ayrı ayrı toplama

        String str ="$1 $23 $134 $2 $7 $24 £40 £32 £2 £65 £4";
        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));

    }
}
