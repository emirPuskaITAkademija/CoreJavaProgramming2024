package three.flow;

import javax.swing.*;

/**
 * Kontrola toka izvršavanja.
 * <p>
 * <li> if-then, if-then-else, switch</li>
 * <li> petlja ili loop, for , while, do-while </li>
 * <li> break, continue, return</li>
 * </p>
 */
public class BlockDemo {
    public static void main(String[] args) {
        String tekst = JOptionPane.showInputDialog("Unesi tekst");
        int length = tekst.length();
        if (length > 100) {
            JOptionPane.showMessageDialog(null, "Unio si jako dug tekst");
        } else {
            JOptionPane.showMessageDialog(null, "Dobro je. Keep it simple short");
        }
    }
}
