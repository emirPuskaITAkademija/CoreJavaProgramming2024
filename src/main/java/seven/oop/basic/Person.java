package seven.oop.basic;

import java.time.LocalDate;
import java.time.Period;

/**
 * Modifikatori vidljivosti.
 * <li>1. public -> javno dostupno unutar cijelog projekta</li>
 * <li>2. bez ključne riječi -> paketno privatno</li>
 * <li>3. protected -> paketno privatno i malo više ..(vežemo za naslijeđivanje)</li>
 * <li>4. private -> privatno unutar konteksta u kojem postoji </li>
 */
public class Person {
    private static int count = 0;

    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    //OVERLOADING ili PREKLAPANJE konstruktora
    public Person() {
        this("", "", LocalDate.now(), Gender.UNKNOWN);
    }

    public Person(String name, String surname, Gender gender) {
        this(name, surname, LocalDate.now(), gender);
    }

    public Person(String name, String surname, LocalDate birthday) {
        this(name, surname, birthday, Gender.UNKNOWN);
    }


    public Person(String name, String surname, LocalDate birthday, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender.equals(Gender.UNKNOWN)) {
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();//static
        Period razmakVremenski = birthday.until(now);// instancna funkcija
        int years = razmakVremenski.getYears();//19
        int months = razmakVremenski.getMonths();//
        System.out.println("Godina: " + years+" mjeseci " + months+" dana " + razmakVremenski.getDays());
        return years;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static void printCounter() {
        System.out.println(count);
    }
}
