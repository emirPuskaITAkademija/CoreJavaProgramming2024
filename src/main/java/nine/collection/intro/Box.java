package nine.collection.intro;
//Generični tip -> omogućio instanciranje parametriziranih objekata
public class Box<G, F>{

    private G field;
    private F anotherField;

    public void setField(G field) {
        this.field = field;
    }

    public G getField() {
        return field;
    }

    public void setAnotherField(F anotherField) {
        this.anotherField = anotherField;
    }

    public F getAnotherField() {
        return anotherField;
    }
}
