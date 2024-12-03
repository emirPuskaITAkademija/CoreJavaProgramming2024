package eight.oop;

public abstract class Beverage {

    private String name;

    public Beverage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double cost();
}
