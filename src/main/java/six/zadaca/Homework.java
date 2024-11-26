package six.zadaca;

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
 * ZADAĆA:
 * Puštajte korisnika da pogodi sve dok ne uspije pogoditi broj.
 * Recite mu na kraju iz kojeg je puta pogodio
 * </p>
 */
public class Homework {
    public static void main(String[] args) {
        //1. dio zadatak je uspješno urađen
        int[] brojevi = new int[11];
        Random random = new Random();
        for (int i = 0; i < brojevi.length; i++) {
            int slucajanBroj = random.nextInt(100);
            brojevi[i] = slucajanBroj;
        }
        //2. je da puštamo korisnika da unese broj sve dok ne pogodi sa unosom
        String message = "";
        int pokusaj = 0;
        boolean pogodiliSte = false;
        while (pogodiliSte == false) {
            pokusaj++;
            System.out.println("Unesi neki broj i okušaj sreću:");
            int unos = new Scanner(System.in).nextInt();
            for (int i = 0; i < brojevi.length; i++) {
                int brojIzNiza = brojevi[i];
                if (brojIzNiza == unos) {
                    message = "Pogodili ste iz " + pokusaj + ". puta ";
                    pogodiliSte = true;
                    break;
                }
            }

        }

        System.out.println(message);
    }
}
