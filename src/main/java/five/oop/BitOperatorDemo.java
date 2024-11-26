package five.oop;

public class BitOperatorDemo {
    public static void main(String[] args) {
        int number = 3;
        int noviBroj = number<<1;
        System.out.println(noviBroj);//6
        int noviNoviBroj = number<<2;
        System.out.println(noviNoviBroj);

        int najnovijiBroj = 12;
        System.out.println(najnovijiBroj>>2);
    }
}
