package five.loops;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] numbers = {
                {23, 12, 34, 99},// i = 0   , j = 0, 1, 2, 3
                {12, 1076, 32323, 12},// i = 1, j = 0, 1, 2, 3
                {622, 345, 212, 90, 10, 2222, 2323, 456} // i = 2, j = 0, 1, 2, 3, 4, 5, 6, 7
        };
        System.out.println("Unesi broj i okušaj sreću: ");
        int unos = new Scanner(System.in).nextInt();
        VANJSKA: for (int i = 0; i < numbers.length; i++) {//3==numbers.length
            int[] niz = numbers[i]; // i = 0  <-> i = 1
            // j = 0, 1, 2, 3   <-> j = 0, 1, 2, 3
            for (int j = 0; j < niz.length; j++) {
                int brojIzNiza = numbers[i][j];
//                int brojIzNiza2 = niz[j]; => TAČNO
                if (unos == brojIzNiza) {
                    System.out.println("Pogodili ste i vaš broj se nalazi na poziciji [" + i + "," + j + "] u našem nizu");
                    break VANJSKA;
                }
            }
        }
    }
}
