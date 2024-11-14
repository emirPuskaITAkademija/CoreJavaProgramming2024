package four.loop;

import java.util.Scanner;

/**
 * do{
 *
 * }while(USLOV_PETLJE)
 */
public class DoWhile {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        do{
            System.out.println(number);
            number++;
        }while (number<11);
    }
}
