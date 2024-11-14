package four.loop;

import java.util.Scanner;

/**
 * Petlja : blok koda koji se izvršava sve dok je zadovolje uslov petlje
 * <p>
 * while( IZRAZ kolko hoćete dugačak ali njegov rez mora biti TRUE/FALSE)
 *
 * <p>
 *     varijabla petlje
 *     while(uslov_petlje){
 *
 *     }
 * </p>
 */
public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj");
        int number = new Scanner(System.in).nextInt();
        while (number < 11) {
            System.out.println("Unio si broj = " + number);
            number++;
        }
    }
}
