package four.array;

import java.util.Scanner;

/**
 * Puštate korisnika da unese broj.
 * Nakon toga nudite korisniku neku nagradu ako je uneseni broj sadržan u nizu 'brojevi'.
 * Ukoliko nije onda mu kažete da uplati ponovo i pokuša ponovno.
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] brojevi = {12, 23, 45, 6746, 2323, 1232, 23, 6, 8, 9, 10};
        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
    }
}
