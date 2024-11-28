package seven.oop.basic;

import java.time.LocalDate;

/**
 * Klasa/Objekat
 * <p>
 * Klasa je šablon/blueprint ili naš način da definiramo vlastiti tip podatka.
 * To je složeni/objektni tip podatka.
 * </p>
 *
 * <p>
 * Klasa može imati:
 * <li>1. polja ili atribute ili properties
 * <li>1.1 instancnim ili objektnim polja</li>
 * <li>1.2 static polja</li>
 * </li>
 * <li>2. funkcije ili metode
 * <li>2.1 instancne ili objektne</li>
 * <li>2.2 static funkcije</li>
 * </li>
 * </p>
 */
public class BasicDemo {
    public static void main(String[] args) {
        //Zašto sam kreirao konstruktore ?
        Person.printCounter();//0
        Person person = new Person();
        person.printCounter();//1
        Person person2 = new Person("Tarik", "Fejzić", Gender.MALE);
        person2.printCounter();//2
        person2.setSurname("Momačko Ženino");
        Person person3 = new Person("Faruk", "Hodžić", LocalDate.of(2005, 5, 23));
        int person3Starost = person3.getAge();
        System.out.println(person3.getName() + " ima " + person3Starost + " godina");
        person3.printCounter();//3
    }
}
