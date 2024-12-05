package eight.oop;

import eight.oop.human.Person;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Jack");
        //box varijabla SIROVOG TIPA
        Box box = new Box();
        box.setField(person);

        //kutijaSaTekstim varijabla sa parametriziranim tipom polja
        Box<String> kutijaSaTekstom = new Box<>();
        kutijaSaTekstom.setField("Ovo je duži tekst");

        Box<Person> personBox = new Box<>();
        personBox.setField(person);

        //kojeg je tipa personBox, kutijaSaTekstom, box -> Box


        List<String> names = new ArrayList<>();
        names.add("Jack");
        List<Person> personList = new ArrayList<>();

    }
}