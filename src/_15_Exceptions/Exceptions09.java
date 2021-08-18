package _15_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions09 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 6};

        System.out.println(arr[1]);  //2
        System.out.println(arr[3]);  //6
        //System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException


        List<String> list = new ArrayList<>(Arrays.asList("Ali","Veli","Deli"));


        System.out.println(list);  //[Bahattin, Kazim, Celil]
        System.out.println(list.get(1)); //Kazim
        System.out.println(list.get(3)); //olmayan index islemi--> IndexOutOfBoundsException

        // List ve array'de  olmayan bir index ile islem yapilirsa
        // Java IndexOutOfBoundsException (RTE :  Unchecked exception) verir.

    }
}
