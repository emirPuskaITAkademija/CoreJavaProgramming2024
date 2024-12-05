package nine.collection.demo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //names -> tip : ArrayList, List, Collection, Iterable
        System.out.println("IDU List<E> elementi");
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Richard");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Sam");
        names.add("John");
        printCollection(names);

        System.out.println(names instanceof Set<?>);//false
        System.out.println(names instanceof Collection<?>);//true



        System.out.println();
        System.out.println("IDU Set<E> elementi");
        HashSet<String> setOfNames = new HashSet<>();
        setOfNames.add("John");
        setOfNames.add("Jane");
        setOfNames.add("Bob");
        setOfNames.add("Mary");
        setOfNames.add("Richard");
        setOfNames.add("Jack");
        String name1 = "Jack";
        setOfNames.add(name1);
        String name2 = "Jack";
        setOfNames.add(name2);
        setOfNames.add("Jack");
        setOfNames.add("Sam");
        setOfNames.add("John");
        printCollection(setOfNames);
    }

    static void printCollection(Collection<String> elements){
        for(String element : elements) {
            System.out.println(element);
        }
    }


    //1. pamte redoslijed elemenata
    //2. primaju duplikate
    //3. indeksirano mozemo pristupati
    static void printList(List<String> elements) {
        for (int i = 0; i < elements.size(); i++) {
            // elements[i]
            String element = elements.get(i);
            System.out.println(element);
        }
    }

    //1. pamte redoslijed elemenata: NE
    //2. primaju duplikate : NE
    //3. indeksirano mozemo pristupati : NE
    static void printSet(Set<String> elements) {
        for(String element : elements) {
            System.out.println(element);
        }
    }
}
