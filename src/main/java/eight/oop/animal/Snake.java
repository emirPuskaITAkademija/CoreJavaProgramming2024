package eight.oop.animal;

public class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("SS CSS CSS ....");
    }

    @Override
    public String species() {
        return "SNAKE";
    }
}
