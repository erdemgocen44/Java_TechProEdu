package day29DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C06_SoruCozumu {
    public static void main(String[] args) {
        /*TODO
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           E. LocalDate.of(2014, Calendar.JUNE, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);           
         */

        //TODO
        // What is the output of the following code?
        LocalDate date = LocalDate.of(2018,Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); 
            /* 
            A. 2018 APRIL 4
            B. 2018 APRIL 30
            C. 2018 MAY 10
            
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            */

            
    }
}