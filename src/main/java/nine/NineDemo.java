package nine;

import nine.collection.intro.Box;

import java.util.Collection;
import java.util.List;

/**
 * Kolekcije:
 * <p>
 *     UVOD.
 *     Postoje tipovi podataka:
 *      <li>1. PROSTI</li>
 *      <li>2. SLOŽENI
 *           <l>2.1 RAW TYPE(sirovi složeni)</l>
 *           <l>2.2 PARAMETRIZIRANI SLOŽENI TIP</l>
 *      </li>
 * </p>
 */
public class NineDemo {
    public static void main(String[] args) {
        //int number = 23;
        //RAW TYPE
        Box sirovaKutija = new Box();
        //PARAMETRIZIRANU kutiju
        //Integer -> int
        Box<String, Integer> novaKutija = new Box<>();
        //Double -> double
        Box<Double, Integer> brojevnaKutija = new Box<>();
        Box<String, String> tekstualnaKutija = new Box<>();


        // Varijable/Objekti -> sirovaKutija, novaKutija, brojevnaKutija, tekstualnaKutija
        // Tip tih varijabli: Box, Box, Box, Box


        //Prvi Slozeni TIP: NIZ
        // int number = 23;
        //int [] numbers = new int[4];
        // 2 ograničenja:
        // 1. fiksna dužina niza  -> stvarno ograničenj
        // 2. svi moraju istog tipa biti : Person





    }
}
