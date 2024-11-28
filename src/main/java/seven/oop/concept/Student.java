package seven.oop.concept;

import seven.oop.basic.Gender;

import java.time.LocalDate;
//Student student = new Student();
//student.setNAme(9,

//Student IS-A Person
public class Student extends Person {

    private String indexNumber;

    public Student() {
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
