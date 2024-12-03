package eight.oop.animal;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Hop Hop Hop..zeko");
    }

    @Override
    public String species() {
        return "ZEC";
    }
}
