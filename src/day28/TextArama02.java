package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TextArama02 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static List<String>anaTextKelimeler=new ArrayList<>();
    static List<String>arananTextKelimeler=new ArrayList<>();
    static List<Integer>ayniKelimelerIndexNo=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        cokluArama();
        listele();
    }
    //ansi console
    private static void listele() {
        for (int i = 0; i < anaTextKelimeler.size(); i++) {
            if(ayniKelimelerIndexNo.contains(i)) {
                System.out.print(ANSI_BLUE + anaTextKelimeler.get(i)+" "+ ANSI_RESET);
            }else
            {
                System.out.print(anaTextKelimeler.get(i)+" ");
            }
            
        }
        
    }
    private static void cokluArama() {
    
        System.out.println("Lütfen girmek istediginiz ana metni giriniz");
        String anaText=scan.nextLine();
        System.out.println("Lütfen aramak istediginiz texti giriniz");
        String arananText=scan.nextLine();
        String anaTextBolunmus[]=anaText.split("\\W");
        String arananTextBolunmus[]=arananText.split("\\W");
        anaTextKelimeler.addAll(Arrays.asList(anaTextBolunmus));
        arananTextKelimeler.addAll(Arrays.asList(arananTextBolunmus));
        //ali eve gel ali eve gel 6 
        
        //ali eve gel 3
            int k=0,sayac,temp;                 //6-3
        for (int i = 0; i <=anaTextKelimeler.size()-arananTextKelimeler.size(); i++) {
            sayac=0;
            k=0;
            //System.out.println(anaTextKelimeler.get(i));
            for (int j =i; j <(i+arananTextKelimeler.size()) ; j++) {
                if (anaTextKelimeler.get(j).equalsIgnoreCase(arananTextKelimeler.get(k))) {
                    sayac++;
                }
                k++;
            }
            if (sayac==arananTextKelimeler.size()) {
                temp=i;
                for (int m = 0; m < arananTextKelimeler.size(); m++) {
                    ayniKelimelerIndexNo.add(temp);
                    temp++;
                }
            }
            
        }
        
    }
}
