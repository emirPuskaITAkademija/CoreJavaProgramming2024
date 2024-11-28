package seven.oop.basic;

public enum Gender {

    MALE("muški", "Snažniji rod"),
    FEMALE("ženski", "Nježniji i pametniji spol"),
    UNKNOWN("unknown", "Unknown..")
    ;


    private String name;
    private String description;

    //konstruktor enuma privatne vidljivosti
    Gender(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
