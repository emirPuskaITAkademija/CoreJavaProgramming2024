package four.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 24;
//        System.out.println(number);
        number = 25;
//        System.out.println(number);
        //1. način kreiranja niza.
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 25;
        for (int i = 0; i < numbers.length; i++) {
            int broj = numbers[i];
            System.out.println("Element na indeksu '" + i + "' je jednak '" + broj + "'");
        }
        System.out.println();
        //2. način
        double[] doubleNumbers = {23.0, 24.0, 25.0};
        for(int i = 0; i < doubleNumbers.length; i++){
            double broj = doubleNumbers[i];
            System.out.println("Element na indeksu '" + i + "' je jednak '" + broj + "'");
        }

        System.out.println();
        String[] names = {"Andrej", "Azur", "Tarik", "Tarik"};
        //enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Idemo samo sa indeksom...bez enhanced..");
        for(int i = names.length-1; i>=0; i--){
            String name = names[i];
            System.out.println(name);
        }

    }
}
