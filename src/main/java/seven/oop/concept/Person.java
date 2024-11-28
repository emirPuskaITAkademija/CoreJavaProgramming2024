package seven.oop.concept;

import seven.oop.basic.Gender;

import java.time.LocalDate;

public class Person{
    protected String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public Person(){}

    public final String getName() {
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    //NADJAČAVANJA -> Person person = new Person() ;
    // person.toString();
    @Override
    public String toString(){
        return name + " -  " + surname;
    }
}
