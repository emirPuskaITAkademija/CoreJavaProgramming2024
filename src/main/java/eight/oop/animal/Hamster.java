package eight.oop.animal;

public class Hamster extends Animal {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Hrk Hrk Hrk Hrčak..");
    }

    @Override
    public String species() {
        return "HRČAK";
    }
}
