package six.oop;

/**
 * Strogo tipiziran programski jezik.
 * <li>
 * 1. PROSTI
 * </li>
 * <li>
 * 2. SLOŽENI ili OBJEKTNI ili instancni -> klasu
 * </li>
 */
public class Demo {
    public static void main(String[] args) {
        //PROSTI
        int number = 23;
        number = 13;
        System.out.println(number);
        number = 110;
        System.out.println(number);
        //SLOŽENI
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;
        numbers[2] = 110;
        System.out.println(numbers);
        //PROBLEMI ili prednosti kada radimo sa nizovima u zavisnosti od toga šta nam treba
        //1. fiksna dužina niza -> ovo je trenutno irrelevantno
        //2. svi unutar niza numbers moraju biti int tipa ili konvertibilni u int tip podatka
        char[] slova = new char[3];
        slova[0] = 'c';
        slova[1] = 'e';
        slova[2] = 'o';
        System.out.println(slova);
        //Ispod -> proces instanciranja
        Person person1 = new Person("Tarik", "Bulić");
        person1.setName("Tarik");
        person1.setAge(23);
        person1.setSurname("Bulic");
        Person person2 = new Person("Tarik", "Fejzić");
        person2.setName("Tarik");
        person2.setSurname("Fejzić-Ženino");
        person2.setAge(18);
        Person person3 = new Person("Andrej", "Grumić");
        person3.setName("Andrej");
        person3.setAge(24);
        person3.setSurname("Grumić P.");

        //Da bi neki film dobio ime prvo ga moram kreirati.
        Movie movie1 = new Movie("Prohujalo s vihorom", "Michael Brown");
        movie1.setDirector("Viktor Fleming");
        movie1.setRating(10);

        Movie movie2 = new Movie("Jaws", "Stiven Spielberg");
        movie2.setRating(8);

        Movie movie3 = new Movie("Dom za vješanje", "Emir Kusturica");
        movie3.setRating(100);

//        Movie.setRating(100);
        String name = new String("Tarik");

        System.out.println(movie1); //six.oop.Movie@b4c966a
        System.out.println(movie2);
        System.out.println(movie3);
    }
}
