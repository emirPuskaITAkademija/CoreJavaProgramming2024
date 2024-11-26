package six.oop;
//Klasu mogu koristiti da definiram složeni ili objektni tip podatka
//String, Person
//Šta sam dobio kreiranem klase ?
// Dobio sam šablon za kreiranje varijabli ili objekata tipa te klase Person
// Niz čuva u svojim indeksiranim poljima podatke ili vrijednsot 23, 13, 110
// Gdje klasa čuva svoje podatke i kakva su to polja klase ?
// Klasa može imati polja ili properties ili attributes.
//ZADATAK

/**
 * Modifikujte klasu Person tako da :
 * <li>DONE: 1. prilikom instanciranja/kreiranja objekta tipa Person MORA se definirati ime i prezime</li>
 * <li>DONE: 2. polja moraju biti privatne vidljivosti</li>
 * <li>DONE: 3. setovanje vrijednosti u polja mora biti preko tzv. setter and getter funkcija</li>
 * <li>DONE: 4. ne dozvoliti da se u polje age upiše negativan integer broj</li>
 * <li>DONE: toString implementirati</li>
 */
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if (age < 0) {
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
