package eight.oop.human;

import eight.oop.Gender;

import java.time.LocalDate;

public class Child extends Person{


    public Child(String name, String surname, LocalDate birthday, Gender gender) {
        super(name, surname, birthday, gender);
    }
}
