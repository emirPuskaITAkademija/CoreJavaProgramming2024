package two;

public class SecondProgram {
    public static void main(String[] args) {
        //CIJELE BROJEVI
        byte firstNumber = 127;
        byte secondNumber = -128;
        //Short 16
        short shortNumber = 32767;
        short secondShortNumber = -32768;
        System.out.println(firstNumber);
        //AUTOMATSKA KONVERZIJA tipa iz byte -> short
        short shortNumber3 = firstNumber;
        System.out.println(shortNumber3);
        short shortyBroj = 89;
        //EKSPLICITNA KONVERZIja tipa iz short -> byte
        byte bytBroj = (byte) shortyBroj;
        //32-bitni zapis
        int number = 23;
        //64-bitni  TIP varijabla = vrijednost;
        long longNumber = 234l;
        // 1. 234 evaluira ili tretira kao integer 32-bitni cijeli broj
        // 2. automatsku konverziju tipa 234 32-bitni => 64 -bitni
        // 3. varijabli longNumber ću upisati vrijednost tog 64 bitni
        double doubleNumber = 3.14;
        // 1. 3.14 vrijednost se tretira 64-bitni
        // 2. operator dodjele će upisati vrijednost 3.14
        float floatNumber = 3.14F;

        char slovo = 'A';
        char novoSlovo = 66;
        int noviBroj = slovo;
        System.out.println("NOVI BROJ = " + noviBroj);
        System.out.println("NOVI SLOVO = " + novoSlovo);
        char separator = ';';
        int separatorNumber = separator;
        System.out.println("SEPARATOR = " + separator + "  SEPARATOR NUMBER= " + separatorNumber );

        boolean condition = true;
        System.out.println(condition);

        //Java 10
        var nekiBroj = 23;//int
        nekiBroj = 345;
        System.out.println("ISPIS NEKI BROJ = "+nekiBroj); // 345
        var slovoNaPapiru = 'A';//char
        slovoNaPapiru = 66;
        System.out.println("SLOVO NA PAPIRU = " +slovoNaPapiru); // B
    }
}
