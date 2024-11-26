package six.oop;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Dženita", "Kovačević");
        person.name = "Dženita";
        person.surname = "Kovačević-Muževo";
        person.age = 21;


        Person person2 = new Person("Azur", "Bulić");
        person2.name = "Azur";
        person2.surname = "Bulić-Momačko";
        person2.age = 23;
    }
}
