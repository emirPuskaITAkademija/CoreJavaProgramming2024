package eight.oop.human;

import eight.oop.Gender;
import eight.oop.animal.Animal;
import eight.oop.animal.Cat;
import eight.oop.animal.Dog;

import java.time.LocalDate;

public class Pensioner extends Person {
    private double pensionAmount;


    public Pensioner(String name, String surname, LocalDate birthDate, Gender gender, double pensionAmount) {
        super(name, surname, birthDate, gender);
        this.pensionAmount = pensionAmount;
    }


    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }
}
