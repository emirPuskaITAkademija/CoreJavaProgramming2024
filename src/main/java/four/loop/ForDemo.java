package four.loop;

import java.util.Scanner;

/**
 * for( inicijalizacija; uslov_petlje; korak petlje ili promjena varijable petlje){
 * <p>
 * }
 */
public class ForDemo {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Korak petlje: " + i);
        }
    }
}
