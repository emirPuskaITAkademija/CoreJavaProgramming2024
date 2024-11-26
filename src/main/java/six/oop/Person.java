package six.oop;
//Klasu mogu koristiti da definiram složeni ili objektni tip podatka
//String, Person
//Šta sam dobio kreiranem klase ?
// Dobio sam šablon za kreiranje varijabli ili objekata tipa te klase Person
// Niz čuva u svojim indeksiranim poljima podatke ili vrijednsot 23, 13, 110
// Gdje klasa čuva svoje podatke i kakva su to polja klase ?
// Klasa može imati polja ili properties ili attributes.
public class Person {
    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    //ZADATAK
    /**
     * Modifikujte klasu Person tako da :
     * <li>1. prilikom instanciranja/kreiranja objekta tipa Person MORA se definirati ime i prezime</li>
     * <li>2. polja moraju biti privatne vidljivosti</li>
     * <li>3. setovanje vrijednosti u polja mora biti preko tzv. setter and getter funkcija</li>
     * <li>4. ne dozvoliti da se u polje age upiše negativan integer broj</li>
     */
}
