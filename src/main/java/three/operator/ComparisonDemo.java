package three.operator;

import javax.swing.*;
import java.util.Scanner;

/**
 * SHIFT + (Fn + F6)
 * <p>
 * Operatori poređenja
 * <li> 1. ==  equality </li>
 * <li> 2. !=  not equal to</li>
 * <li> 3. >    </li>
 * <li> 4. >=   </li>
 * <li> 5. <    </li>
 * <li> 6. <=    </li>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvu cjelobrojnu vrijednost");
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvu cjelobrojnu"));
        System.out.println("Unesi drugu cjelobrojnu vrijednost");
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugu cjelobrojnu"));
        if (number1 == number2) {
            System.out.println("Jednaki brojevi");
        }
        if (number1 != number2) {
            System.out.println("Nejednaki brojevi");
        }
        if (number1 > number2) {
            System.out.println("Prvi veći od drugog");
        }
        if (number1 >= number2) {
            System.out.println("Prvi veći ili jednak drugom");
        }
        if (number1 < number2) {
            System.out.println("Prvi manji od drugog");
        }
        if (number1 <= number2) {
            System.out.println("Prvi manji ili jednak drugom");
        }
    }
}
