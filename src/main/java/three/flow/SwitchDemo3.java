package three.flow;

import javax.swing.*;
import java.util.Scanner;

/**
 * int month = redniBrojMjeseca ... 1 -12
 * int year = 1 - 10000
 * <p>
 * Šta želim da program izračuna ?
 * int numberOfDaysInMonth = 30 31 28  29
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj mjeseca u godini");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Unesi godinu");
        int year = new Scanner(System.in).nextInt();

        int numberOfDaysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDaysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDaysInMonth = 30;
                break;
            //Sve prestupne godine djeljive su sa četiri ako nisu djeljive sa 100,
            //  kojima se dodaju one djeljive sa 400.
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            default:
                numberOfDaysInMonth = 0;
        }
        String message = "Broj dana u mjesecu je " + numberOfDaysInMonth;
        JOptionPane.showMessageDialog(null, message);

    }
}
