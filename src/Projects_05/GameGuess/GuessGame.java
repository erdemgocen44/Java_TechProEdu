package Projects_05.GameGuess;

import java.util.Scanner;

public class GuessGame {

    /*
        Create a method name is randomGenerator().

        This method will create HuseyinBYCalısma.random number from 0 to 100.

        This method will return that HuseyinBYCalısma.random number.

        Return type is int

     */



 /*


        randomGenerator ()  methodunu oluşturalım.
        Bu method 0 ile 100 arasında random bir sayı oluşturmalı.
        Bu method random sayıyı return etmelı.
        Return türü int olmalı
     */

    public int randomGenerator() {

        int randomnum = (int) ((Math.random() * 100) + 1);

        return randomnum;
    }





  /*
        Create a method name is LetsGuess().

        This method take one int as a parameter.

        Return type is void.

        In this method you must continue to guess numbers until the you guess the correct number.

        When your number is less than HuseyinBYCalısma.random number then print "Your number is too low".

        When your number is more than HuseyinBYCalısma.random number then print "Your number is too high".

        When your guess number is equal to HuseyinBYCalısma.random number than print "You got it !!".

        And stop execution.

        Your maximum attempt to guess is 5.

        If your guess reach to 5 than print "You didn't get it dude!!!"

        Note:
         1) While guessing the numbers you must use the scanner class.
         2) Both of these methods are not a static methods

     */




/*

         LetsGuess ()  methodunu oluşturalım.
         Bu method parametre olarak bir int almalı.
        Return türü void olsun.
        Bu method da, doğru sayıyı tahmin edene kadar sayıları tahmin etmeye devam etmelisiniz.
        Numaranız random sayıdan küçükse "Your number is too low" yazdıralım.
        Numaranız random sayıdan büyükse "Your number is too high" yazdıralım.
        Tahmin numaranız  random sayıya eşit olduğunda "You got it !!" yazdıralım
        Ve execution durdurun.
        Tahmin girişiminiz maksimum 5'tir.
        Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"
        Not:
         1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
         2) Bu methodların her ikisi de statik bir method değildir
 */

    public void LetsGuess(int rand) {

        Scanner scanner = new Scanner(System.in);

        int tahnum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print(i + 1 + ".Sayi gir: ");
            tahnum = scanner.nextInt();

            if (tahnum < rand) {
                System.out.println("Your number is too low");
            } else if (tahnum > rand) {
                System.out.println("Your number is too high");
            } else if (tahnum == rand) {
                System.out.println("You got it !!");
                break;
            }
        }
        if (tahnum != rand) {
            System.out.println("Anlamadım dostum !!!");
        }
    }
}
