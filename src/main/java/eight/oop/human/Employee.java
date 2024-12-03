package eight.oop.human;

import eight.oop.Gender;
import eight.oop.animal.Animal;

import java.time.LocalDate;

public class Employee extends Person{
    private double salaryAmount;
    public Employee(){
        super();
//        System.out.println("Employee Constructor");
    }

    public Employee(String name, String surname, LocalDate birtDate, Gender gender, double salaryAmount) {
        super(name, surname, birtDate, gender);
        this.salaryAmount = salaryAmount;
//        System.out.println("Employee Constructor sa params");
    }



    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
