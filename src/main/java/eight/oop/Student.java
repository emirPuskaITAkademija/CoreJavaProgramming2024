package eight.oop;

import java.time.LocalDate;

//Klasa kada nasljeđuje drugu klasu => extends
public class Student extends Person {
    private String indexNumber;

    public Student(String name, String surname, LocalDate birthDate, Gender gender, String indexNumber) {
        super(name, surname, birthDate, gender);
        this.indexNumber = indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
}
