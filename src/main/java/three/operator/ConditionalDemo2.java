package three.operator;

import javax.swing.*;

/**
 * Java 1.7  ?
 *
 * Dužan: instanceOf -> klase i naslijeđivanje
 *
 * == -> kod složenih tipova poredi memorijske lokacije ne vrijednost na toj lokaciji
 * .equals -> koristimo kod String ako želimo uvijek da se radi poređenje po vrijednosti
 */
public class ConditionalDemo2 {
    public static void main(String[] args) {
//        String unesenoIme = JOptionPane.showInputDialog("Unesi Andrej");
//        String result = "Andrej" == unesenoIme ? "Ti si fkt unio Andrej i svaka ti čast" : "Bolan unesi Andrej";
//        JOptionPane.showMessageDialog(null, result);
//        System.out.println(result);
        String name = "Andrej";// String literal "Andrej" MEM1
        String name2 = new String("Andrej").intern();// "Andrej" MEM2 -> new
        String name3 = "Andrej";//String literal  // "Andrej" MEM1
        System.out.println(name == name2);//false
        System.out.println(name == name3);//true -> ==
        name3 = "Faruk";
        System.out.println(name == name3);//false
        System.out.println(name);
        System.out.println(name3);
        System.out.println(name.equals(name3));
        System.out.println(name.equals(name2));

    }
}
