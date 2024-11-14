package four.array;

public class MultiDimenArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr.", "Mrs."},
                {"Smith", "Jones"},
        };
        String fullName = names[0][0] + " " + names[1][0];
        System.out.println(fullName);
        String women = names[0][1] + " " + names[1][0];
        System.out.println(women);
    }
}
