package eight.oop;
//pattern ponašanja
@FunctionalInterface
public interface Flyable {

    void fly();

    //može imati više apstraktnih metoda...

    //1.8 postoji jedan specifični interfejs koji se zove FUNKCIONALNI
    //Koji je preduvjet da interfejs zovemo funkcionalnim ?
    //POTREBAN i DOVOLJAN USLOV : da ima jednu i samo jednu apstraktnu metodu
}
