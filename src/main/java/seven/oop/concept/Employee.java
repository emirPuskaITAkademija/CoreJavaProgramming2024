package seven.oop.concept;

import seven.oop.basic.Gender;

import java.time.LocalDate;

// 2 klase -> 1. klasa nasljeđuje 2. klasu (Employee IS-A Person)
public class Employee extends Person {
    private double salary;

    public Employee() {
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //MARKER: Jozino pitane
//    @Override
//    public String getName() {
//        String name =  super.getName();
//        return name +" [Employee]";
//    }
}
