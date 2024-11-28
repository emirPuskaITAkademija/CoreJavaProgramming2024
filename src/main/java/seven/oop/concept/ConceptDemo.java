package seven.oop.concept;

import seven.oop.basic.Gender;
import seven.oop.concept.animal.*;
import seven.oop.concept.human.Employee;
import seven.oop.concept.human.Pensioner;
import seven.oop.concept.human.Person;
import seven.oop.concept.human.Student;

import java.time.LocalDate;

public class ConceptDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Emir");
        person.setSurname("Puška");
        person.setGender(Gender.MALE);
        person.setBirthday(LocalDate.of(1988, 9, 12));
        printPerson(person);
        System.out.println(person);
//        printEmployee(person);
//        printPensioner(person);

        Employee employee = new Employee();
        employee.setName("Andrej");
        employee.setSurname("Grumić");
        employee.setGender(Gender.MALE);
        employee.setBirthday(LocalDate.of(2000, 7, 6));
        employee.setSalary(6999);
//        printEmployee(employee);
        printPerson(employee);
        System.out.println(employee);



        //student -> tipa Student, Person
        Student student = new Student();
        student.setName("Tarik");
        student.setSurname("Bulić");
        student.setGender(Gender.MALE);
        student.setBirthday(LocalDate.of(1993, 5, 13));
        student.setIndexNumber("15XX2323");
//        printStudent(student);
        printPerson(student);
        System.out.println(student);

        Pensioner pensioner = new Pensioner();
        pensioner.setName("Azur");
        pensioner.setSurname("Bulić");
        pensioner.setBirthday(LocalDate.of(2003, 3, 13));
        pensioner.setGender(Gender.MALE);
        pensioner.setPension(900.67);
//        printPensioner(pensioner);
        printPerson(pensioner);
        System.out.println(pensioner);

        //dog - tipa Animal, Dog
        Animal dog = new Dog("Lesi");
        //cat - tipa Anima, Cat
        Cat cat = new Cat("Cicko");
        //rabbit - tipa Animal, Rabbit
        Rabbit rabbit = new Rabbit("Maki");
        //hamster - tipa Animal, Hamster
        Hamster hamster = new Hamster("Hrki");
        playAnimalSound(dog);
        playAnimalSound(cat);
        playAnimalSound(rabbit);
        playAnimalSound(hamster);

        employee.setAnimal(rabbit);
        //OPEN FOR extension / CLOSED for MODIFICATION
        System.out.println(employee.getName()+" HAS A Rabbit with name " + employee.getAnimal().getName());
        employee.setAnimal(cat);
        System.out.println(employee.getName()+" HAS A Cat with name " + employee.getAnimal().getName());
        employee.setAnimal(dog);
        System.out.println(employee.getName()+" HAS A Dog with name " + employee.getAnimal().getName());
        employee.setAnimal(hamster);
        System.out.println(employee.getName()+" HAS A HAMSTER with name " + employee.getAnimal().getName());
        //DOMAĆA ZADAĆA:
        // Izmijeniti Pensioner klasu na način da i naš Azur može imati sve ove divne životinje.
    }

    private static void playAnimalSound(Animal animal) {
        animal.playSound();
    }


    //Student, Pensione
    private static void printPerson(Person person) {
        System.out.println(person.getName()+" "+person.getSurname()+", " +person.getBirthday());
    }

//    private static void printStudent(Student student) {
//        System.out.println(student.getName()+" "+student.getSurname()+", " +student.getBirthday());
//    }

//    private static void printEmployee(Employee employee) {
//        System.out.println(employee.getName()+" "+employee.getSurname()+", " +employee.getBirthday());
//    }

//    private static void printPensioner(Pensioner pensioner) {
//        System.out.println(pensioner.getName()+" "+pensioner.getSurname()+", " +pensioner.getBirthday());
//    }
}
