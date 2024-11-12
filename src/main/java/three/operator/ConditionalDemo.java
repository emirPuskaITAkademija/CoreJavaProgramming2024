package three.operator;

import javax.swing.*;
import java.util.Scanner;

/**
 *
 * Markirati dio koji želite zakomentirati:
 * CTRL + /
 * <p>
 *
 * </p>
 * && AND
 * <p>
 * ||(AltGr + W) ILI
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Enter second number: ");
        int number2 = new Scanner(System.in).nextInt();
        if(number1==23 || number1>=number2){
            System.out.println("Moj uslov je zadovoljen");
            JOptionPane.showMessageDialog(null, "Moj uslov je zadovoljen");
        }

        if(number2==23 && number2>=number1){
            System.out.println("Moj DRUGI rigorozniji uslov je zadovoljen");
            JOptionPane.showMessageDialog(null, "oj DRUGI rigorozniji uslov je zadovoljen");
        }
    }
}
