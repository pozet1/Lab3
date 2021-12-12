import java.util.Scanner;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Podaj liczbe");
            int a = scan.nextInt();
            if (a == 0){
                System.out.println(StatusEnum.KONIEC);
            break;
            }
            else

            switch (a){

                case 1:
                    System.out.println(LiczbyEnum.ONE+" "+" "+StatusEnum.KONTYNUUJEMY);
                    continue;
                case 2:
                    System.out.println(LiczbyEnum.TWO+" "+" "+StatusEnum.KONTYNUUJEMY);
                    continue;
                case 3:
                    System.out.println(LiczbyEnum.THREE+" "+" "+StatusEnum.KONTYNUUJEMY);
                    continue;
                case 4:
                    System.out.println(LiczbyEnum.FOUR+" "+" "+StatusEnum.KONTYNUUJEMY);
                    continue;
                case 5:
                    System.out.println(LiczbyEnum.FIVE+" "+" "+StatusEnum.KONTYNUUJEMY);
                    continue;
                case 6:
                    System.out.println(LiczbyEnum.SIX+" "+" "+StatusEnum.KONTYNUUJEMY);
                    continue;


            }
        }
    }
}


enum LiczbyEnum {
    ONE,TWO,THREE,FOUR,FIVE,SIX
}

enum StatusEnum{
    KONTYNUUJEMY,KONIEC
}


/* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

/* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
 * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */
