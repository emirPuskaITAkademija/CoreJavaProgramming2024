package three.flow;

import javax.swing.*;

/**
 * Polažete važan ispit.
 * Profesor ocjenjuje vaš rad.
 * Profesor se fokusira na pregled vašeg rada i sabere poene i unese u vaš program
 * a program jednostavno izbaci ocjenu koju ste dobili.
 *
 * <p>
 *     int points = unos iz konzole ili iz GUI
 *     char score = 'A'  'B' 'C' ..'F'
 *     points>=90  -> score 'A'
 *     points=>80 -> score 'B'
 *
 * </p>
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int points = Integer.parseInt(JOptionPane.showInputDialog("Broj poena koje je student ostvario na ispitu"));
        char score;
        if(points>=90){
            score = 'A';
        }else if(points>=80){
            score = 'B';
        } else if (points>=70) {
            score = 'C';
        } else if (points>=60) {
            score = 'D';
        }else{
            score = 'F';
        }
        String message = "Score na ispitu je : " + score;
        JOptionPane.showMessageDialog(null, message);
    }
}
