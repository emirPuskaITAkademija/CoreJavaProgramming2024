package three.operator;

/**
 * ++
 * --
 * +
 * -
 * ! inverzija  Logical completement
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number++);//23
        System.out.println(number);//24
        number = 23;
        System.out.println(++number);//24
        System.out.println(number);//24

        boolean condition = false;
        System.out.println(condition);//false
        System.out.println(!condition);//true
    }
}
