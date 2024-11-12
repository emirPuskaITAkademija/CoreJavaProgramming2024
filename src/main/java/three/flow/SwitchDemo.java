package three.flow;

import javax.swing.*;
import java.util.Scanner;

/**
 * Kao ulaz u program korisnik unosi redni broj dana u sedmici.
 * Kao rezultat program ispisuje ime dana na Njemačkom jeziku.
 *
 * switch-case-break
 */
public class SwitchDemo {
    public static void main(String[] args) {
        // y = f(x)
        // dayName = f(redniBroj)
        System.out.println("Unesi redni broj dana u sedmici:");
        int redniBroj = new Scanner(System.in).nextInt();
        String dayName;
        switch (redniBroj) {
            case 1:
                dayName = "Montag";
                break;
            case 2:
                dayName = "Dienstag";
                break;
            case 3:
                dayName = "Mittwoch";
                break;
            case 4:
                dayName = "Donnerstag";
                break;
            case 5:
                dayName = "Freitag";
                break;
            case 6:
                dayName = "Samstag";
                break;
            case 7:
                dayName = "Sonntag";
                break;
            default:
                dayName = "Sedmica ima 7 dana. Unesi broj između 1-7";
                break;
        }
        String message = "Za uneseni redni broj dana u sedmici " + redniBroj + " naziv dana na Njemačkom je " + dayName;
        System.out.println(message);
        JOptionPane.showMessageDialog(null, message);
    }
}
