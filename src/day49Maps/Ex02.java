package day49Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
             /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdirin.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
*/

Scanner scan =new Scanner(System.in);

System.out.print("Bir metin giriniz : ");

String metin=scan.nextLine();

kelimeSay(metin);
    }

    public static void kelimeSay(String metin) {

        HashMap<String,Integer>map=new HashMap<>();
        String kelime[]=metin.split(" ");

        for (int i = 0; i < kelime.length; i++) {
            if(map.containsKey(kelime[i])){
map.put(kelime[i],map.get(kelime[i])+1);
            }else{map.put(kelime[i],1);

            }
        }
        System.out.println(map);


    }
}
