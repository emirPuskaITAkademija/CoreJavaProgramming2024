package nine.error;

import eight.oop.human.Person;

import java.io.FileNotFoundException;

public class ErrorDemo {

    public static void main(String[] args) {
        //Exception -> Izuzetak
        int[] numbers = new int[3];
        numbers[0] = 23;
//        numbers[3] = 34;//2

        int number = 23;
        System.out.println(number);
//        int result = number/0;
//        System.out.println(result);
        Person p = null;
//        System.out.println(p.getName());


        try{
            readFile("");
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }

    }


    //FileNotFoundException -> nema u hijerarhiji naslijeđivanja nikako RuntimeException
    static void readFile(String filename) throws FileNotFoundException {
        if(filename!=null && !filename.isBlank()){
            System.out.println("Reading file: " + filename);
        }else{
            throw new FileNotFoundException("File not found");
        }
    }
}
