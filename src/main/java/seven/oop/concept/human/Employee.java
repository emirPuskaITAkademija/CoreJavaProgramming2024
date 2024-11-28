package seven.oop.concept.human;

import seven.oop.concept.animal.Animal;
import seven.oop.concept.animal.Cat;
import seven.oop.concept.animal.Rabbit;

// 2 klase -> 1. klasa nasljeđuje 2. klasu (Employee IS-A Person)
public class Employee extends Person {
    private double salary;
//    private Rabbit rabbit;
//    private Cat cat;
    private Animal animal;

    public Employee() {
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    //    public void setRabbit(Rabbit rabbit) {
//        this.rabbit = rabbit;
//    }
//
//    public Rabbit getRabbit() {
//        return rabbit;
//    }
//
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
//
//    public Cat getCat() {
//        return cat;
//    }

    //MARKER: Jozino pitane
//    @Override
//    public String getName() {
//        String name =  super.getName();
//        return name +" [Employee]";
//    }
}
