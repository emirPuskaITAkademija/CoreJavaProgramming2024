package seven.oop.concept;

import seven.oop.basic.Gender;

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
