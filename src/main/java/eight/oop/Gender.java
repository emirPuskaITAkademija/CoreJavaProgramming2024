package eight.oop;

public enum Gender {

    MALE("MUŠKI"),
    FEMALE("ŽENSKI"),
    UNKNOWN("Još sam nedefiniran");

    private String description;

    Gender(String description) {
        this.description = description;
    }
}
