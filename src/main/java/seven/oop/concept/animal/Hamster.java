package seven.oop.concept.animal;

public class Hamster extends Animal {


    public Hamster(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Hrk Hrk Hrk..");
    }
}
