package seven.oop.concept.human;

//Pensioner IS-A Person
// final znači da se ne može NASLIJEDITI
public final class Pensioner extends Person {

    private double pension;

    public Pensioner() {
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}
