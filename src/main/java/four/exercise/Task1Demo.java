package four.exercise;

public class Task1Demo {
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;
        int ostatak = x % y;
        String message;
        if(ostatak == 0){
            message = "Ostatka nema";
        }else if(ostatak<1000){
            message = "Ostatka manji od 1000";
        }else{
            message = "Ostatak je veći od 1000";
        }
        System.out.println("Ostatak je = " +ostatak);
        System.out.println(message);
    }
}
