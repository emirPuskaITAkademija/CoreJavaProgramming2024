package eight.oop.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Wav Wav Wav ..");
    }

    @Override
    public String species() {
        return "PAS";
    }
}
