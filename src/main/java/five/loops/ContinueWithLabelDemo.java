package five.loops;


/**
 * var objekat = {
 * name:"Andrej",
 * surname: "Grumić"
 * };
 * <p>
 * objekat.name -> "Andrej"
 * objekat[name] -> "Andrej"
 * <p>
 * any
 * <p>
 * String objekat;
 * objekat: string
 */

/**
 * UPGRADE: ZADAĆA
 * Izbrojati KOLIKO se puta ponavlja riječ u rečenici.
 */
// operatori na nivou bita
public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "hotrazi huriječ hud u rečenici. Robin Hood je hud zato što prikuplja novce hud hud";
        String rijec = "hud";
        boolean jesteSadrzana = false;
        PRESKOCI:
        for (int i = 0; i < recenica.length(); i++) {
            //i = 9 h
            for (int j = 0; j < rijec.length(); j++) {
                int k = i + j;
                char slovoIzRecenice = recenica.charAt(k); // 9+0 -> h; 9+1 ->u; 9+2 -> r
                char slovoRijeci = rijec.charAt(j);// 0 -> h; 1 -> u; 2 -> d
                if (slovoIzRecenice != slovoRijeci) {
                    continue PRESKOCI;
                }
            }
            jesteSadrzana = true;
            break;
        }
        String message = jesteSadrzana ? "Riječ jeste sadrzana" : "Rijec nije sadrzana";
        System.out.println(message);
    }
}
