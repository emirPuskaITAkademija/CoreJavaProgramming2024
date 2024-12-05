package nine.collection.demo;

import eight.oop.Gender;
import eight.oop.human.Person;

import java.time.LocalDate;
import java.util.*;

public class PersonDemo {

    public static void main(String[] args) {
        Person john = new Person("John", "Wick", LocalDate.now(), Gender.MALE);
        Person faruk = new Person("Faruk", "Bulić", LocalDate.of(1988, 1, 1), Gender.MALE);
        Person tarikFejzic = new Person("Tarik", "Fejzić", LocalDate.of(2000, 1, 1), Gender.MALE);
        Person dzenitaKovacevic = new Person("Dženita", "Kovačević", LocalDate.of(2005, 5, 1), Gender.FEMALE);
        Person dzenitaKovacevic2 = new Person("Dženita", "Kovačević", LocalDate.of(2005, 5, 1), Gender.FEMALE);
        Person dzenitaKovacevic3 = new Person("Dženita", "Kovačević", LocalDate.of(2005, 5, 1), Gender.FEMALE);
        Person dzenitaKovacevic4 = new Person("Dženita", "Kovačević", LocalDate.of(2005, 5, 1), Gender.FEMALE);
        Person azurBulic = new Person("Azur", "Bulić", LocalDate.of(1988, 1, 1), Gender.MALE);
        Person jovanCarevic = new Person("Jovan", "Carevic", LocalDate.of(1999, 1, 1), Gender.MALE);

        //UBACITI persone u LISTU
        System.out.println("LIST");
        List<Person> personList = new ArrayList<>();
        personList.add(john);
        personList.add(faruk);
        personList.add(tarikFejzic);
        personList.add(dzenitaKovacevic);
        personList.add(dzenitaKovacevic2);
        personList.add(dzenitaKovacevic3);
        personList.add(dzenitaKovacevic4);
        personList.add(azurBulic);
        personList.add(jovanCarevic);
        printList(personList);

        System.out.println();
        System.out.println("SET");
        //UBACITI persone u SET

        //TIP: LinkedHashSet, Set, Collection, Iterable, Object
        Set<Person> personSet = new TreeSet<>();
        personSet.add(john);
        personSet.add(faruk);
        personSet.add(tarikFejzic);
        personSet.add(dzenitaKovacevic);
        personSet.add(dzenitaKovacevic);
        personSet.add(dzenitaKovacevic);
        personSet.add(dzenitaKovacevic);
        personSet.add(dzenitaKovacevic2);
        personSet.add(dzenitaKovacevic3);
        personSet.add(dzenitaKovacevic4);
        personSet.add(azurBulic);
        personSet.add(jovanCarevic);
        printSet(personSet);


//        System.out.println("Hash Codes");
//        System.out.println(dzenitaKovacevic.hashCode());
//        System.out.println(dzenitaKovacevic2.hashCode());
//        System.out.println(dzenitaKovacevic3.hashCode());
//        System.out.println(dzenitaKovacevic4.hashCode());


//        printPersons(dzenitaKovacevic, dzenitaKovacevic2, dzenitaKovacevic3, dzenitaKovacevic4);
    }

    //argumenti ili parametri funkcije -> ... varargs
    public static void printPersons(Person... persons) {

        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            System.out.println(person);
        }
    }


    /**
     * 1. Pamti redoslijed <></>
     * 2. Prima duple Person elemente <></>
     * 3. Indeksiran pristup moguć
     *
     * @param list
     */
    static void printList(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            System.out.println(person);
        }
    }


    static void printSet(Set<Person> personSet){
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
