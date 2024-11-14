package four.array;

import java.util.Random;
import java.util.Scanner;

/**
 * Puštate korisnika da unese broj.
 * Nakon toga nudite korisniku neku nagradu ako je uneseni broj sadržan u nizu 'brojevi'.
 * Ukoliko nije onda mu kažete da uplati ponovo i pokuša ponovno.
 * <>
 * <p>
 * MODIFIKOVATI zadatak tako da vrijednosti elemenata u nizu 'brojevi' na svako
 * startanje programa budu različite.
 * Vrijednost elementa treba da bude broj od 0-1000.
 * Random random = new Random();
 * int slucajniBroj = random.nextInt(1000);
 * </>
 * <p>
 *     ZADAĆA:
 *     Puštajte korisnika da pogodi sve dok ne uspije pogoditi broj.
 *     Recite mu na kraju iz kojeg je puta pogodio
 * </p>
 */
public class BreakUpgradeDemo {
    public static void main(String[] args) {
        int[] brojevi = new int[11];
        Random random = new Random();
        for (int i = 0; i < brojevi.length; i++) {
            //neki broj između 1 - 999
            int slucajniBroj = random.nextInt(1000);
            brojevi[i] = slucajniBroj;
//            System.out.println(brojevi[i]);
        }

        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
        String message = "";
        for (int i = 0; i < brojevi.length; i++) {
            int broj = brojevi[i];
            if (broj == uneseniBroj) {
                message = "Pogodili ste...";
                break;
            }
        }
        if (message.isBlank()) {
            message = "Niste pogodili..";
        }
        System.out.println(message);
    }
}
