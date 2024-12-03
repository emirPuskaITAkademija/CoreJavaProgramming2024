package eight.oop.animal;

import eight.oop.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu Ćiu Ćiu Tup");
    }

    @Override
    public String species() {
        return "PTICA";
    }

    @Override
    public void fly() {
        System.out.println(" Ja sam ptica i imam krila i letim...");
    }
}
