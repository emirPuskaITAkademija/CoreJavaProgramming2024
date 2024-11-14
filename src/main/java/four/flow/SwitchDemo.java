package four.flow;

import javax.swing.*;

/**
 * instanceOf -> klase, apstraktne klase, interfejse i naslijeđivanje
 * enum
 * <p>
 * switch  i if
 * </p>
 * <p>
 * Trebamo napraviti program u kojem će korisnik unijeti
 * naziv dana na Engleskom, a program će nam izbaciti kao rezultat redni
 * broj dana u sedmici.
 * String unosNazivaDana = "Monday"
 * int redniBrojDanaUSedmici = ?
 * </p>
 * samstags
 * Samstag
 * Kopf
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String userDayInput = JOptionPane.showInputDialog("Unesite naziv dana u sedmici na Engleskom jeziku");
        int numberOfDayWithinWeek;
        switch (userDayInput) {
            case "Monday":
                numberOfDayWithinWeek = 1;
                break;
            case "Tuesday":
                numberOfDayWithinWeek = 2;
                break;
            case "Wednesday":
                numberOfDayWithinWeek = 3;
                break;
            case "Thursday":
                numberOfDayWithinWeek = 4;
                break;
            case "Friday":
                numberOfDayWithinWeek = 5;
                break;
            case "Saturday":
                numberOfDayWithinWeek = 6;
                break;
            case "Sunday":
                numberOfDayWithinWeek = 7;
                break;
            default:
                numberOfDayWithinWeek = 0;
                break;
        }
        String message = numberOfDayWithinWeek == 0 ? "Nisi unio ispravan naziv dana na engl jeziku" : "Za uneseni naziv dana u sedmici na engl. jez '" + userDayInput + "' redni broj dana u sedmici je " + numberOfDayWithinWeek;
        JOptionPane.showMessageDialog(null, message);
    }
}
