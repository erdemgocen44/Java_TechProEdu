package day25;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMehmetHocaTekrar {
    static Scanner scan = new Scanner(System.in);
    static int[][] arr = new int [2][2];
    static int[][] arr1 = new int [2][2];
    static int[][] sonucArr = new int [2][2];



    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(arr));

        oku();
        ikiMatrisOku();
  
        matrisTopla();
    }

    public static void matrisTopla() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               sonucArr[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("Sonuç yazdırılıyor");
        listele(sonucArr);
    }
    public static void ciftOlanlar() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println("Çift olanlar : " + arr[i][j]);
                }
            }
        }
    }

    public static void oku() {
        // 2*2 matrisi kullanıcıdan alma
        System.out.println("1.Matrisi okuyun : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(i + ", " + j + " elamanı giriniz : ");
                arr[i][j] = scan.nextInt();
            }
        }
        listele(arr);

    }

    public static void ikiMatrisOku() {
        // 2*2 matrisi kullanıcıdan alma
        System.out.println("2.Matrisi okuyun : ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(i + ", " + j + " elamanı giriniz : ");
                arr1[i][j] = scan.nextInt();
            }
        }
        listele(arr);

    }

    public static void listele(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
