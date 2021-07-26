package day23;

import java.util.Scanner;



public class practice02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz : ");

     String kelime=scan.nextLine();

     int i=0;
     do {
         if(i%2==1){
             System.out.print(kelime.charAt(i)+", ");
         }
         i++;
     } while (i<kelime.length());
     

    }
}
