package five.loops;

public class ExerciseDemo {
    public static void main(String[] args) {
        String sentence = "Potrazi rijec h ud u   hudssshuds hhhuuds recenici. Robin huud je hud   jer je veoma hud  hhud.";
        String targetWord = "hud";

        int brojPonavljanja = 0;
        int j = 0;

        for (int i = 0; i < sentence.length(); i ++) {
            int slovoRecenice = sentence.charAt(i);
            int slovoRijeci = targetWord.charAt(j);
            if (slovoRecenice!= slovoRijeci) {
                i = i - j;
                j = 0;
                continue;
            }
            j++;
            if (j >= targetWord.length()) {
                j = 0;
                brojPonavljanja++;
            }
        }

        System.out.println(brojPonavljanja);
    }
}
