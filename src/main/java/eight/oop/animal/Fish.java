package eight.oop.animal;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Brb Brb Brb Fish..");
    }

    @Override
    public String species() {
        return "RIBA";
    }
}
