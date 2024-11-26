package six.oop;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Dženita", "Kovačević");
        person.setSurname("Kovačević-Muževo");
        person.setAge(21);
        System.out.println(person);

        Person person2 = new Person("Azur", "Bulić");
        person2.setSurname("Bulić-Momačko");
        person2.setAge(23);
        System.out.println(person2);

        Person person3 = new Person("Andrej", "Grumić");
//        person3.setAge(25);
        person3.setAge(-17);
        System.out.println(person3);
    }
}
