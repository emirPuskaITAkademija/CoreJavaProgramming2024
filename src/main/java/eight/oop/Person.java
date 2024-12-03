package eight.oop;

import java.time.LocalDate;
import java.time.Period;

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
public class Person {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;

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

    @Override
    public String toString() {
        return name + " " + surname + " " + birthDate + " " + gender + " star " + getAge() + " godina";
    }
}
