package two.operator;

/**
 * Unarni operatori:
 * <li> 1. + - SIGN</li>
 * <li> 2. ++  INCREMENT
 *      <li>2.1 PRE</li>
 *      <li>2.2 POST</li>
 * </li> I
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        number++;//POST
        System.out.println(number);//24
        number = 23;
        ++number;//PRE
        System.out.println(number);//24
        number = 23;
        System.out.println(++number);//24  -> 2 koraka : increment i pošalji u konzolu
        number = 23;
        System.out.println(number++);//23 -> poslat pa onda uvećat
        System.out.println(number);//24
    }
}
