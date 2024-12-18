package eight.oop.human;

import eight.oop.Gender;
import eight.oop.animal.Animal;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Klasa može imati:
 * <1.> polja
 * <i>static</i>
 * <i>instancna ili objektna</i>
 * </1.>
 * <2>
 * KONSTRUKTOR
 * </2>
 * <3.>
 * <i> FUNKCIJE instance -> person.setName("Tarik");</i>
 * <ii>FUNKCIJA static -> main  Demo.main, Person.setCounter()</ii>
 * </3.>
 * <4.>
 * UGNIJEŽDENE klase
 * <i>STATIC</i>
 * <ii>instance</ii>
 * </4.>
 */
public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;
    private Animal animal;

    public Person() {
        this("", "", LocalDate.now(), Gender.UNKNOWN);
//        System.out.println("Person Constructor");
    }

    public Person(String name, String surname, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
//        System.out.println("Person Constructor sa parametrim");
    }

    public int getAge() {
        Period period = birthDate.until(LocalDate.now());
        int years = period.getYears();
        return years;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        String text = name + " " + surname + " " + birthDate + " " + gender + " star " + getAge() + " godina";
        if (animal != null) {
            text = text + " i ima " + animal.species() + " sa imenom " + animal.getName();
        }
        return text;
    }

    //HashSet ->


    //instancne -> p1 i p2 p1.hashCode()   String name  p1.equals(name);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(birthDate, person.birthDate) && gender == person.gender && Objects.equals(animal, person.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, gender, animal);
    }


    // int
    // 0 -> jednaki p1 i p2
    // 1 -> p1 veći od p2
    // -1 -> p1 manji od p2
    @Override
    public int compareTo(Person comparedPerson) {
        int birthDateComparison = this.birthDate.compareTo(comparedPerson.getBirthDate());
        if (birthDateComparison != 0) {
            return birthDateComparison;
        }

        int surnameComparison = this.surname.compareTo(comparedPerson.getSurname());
        if (surnameComparison != 0) {
            return surnameComparison;
        }

        int nameComparison = this.name.compareTo(comparedPerson.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        return this.gender.compareTo(comparedPerson.getGender());
    }
}
