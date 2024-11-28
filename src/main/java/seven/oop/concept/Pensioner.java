package seven.oop.concept;

import seven.oop.basic.Gender;

import java.time.LocalDate;

//Pensioner IS-A Person
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
