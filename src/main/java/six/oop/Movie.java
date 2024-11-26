package six.oop;
//Klasa je šablon za instanciranje/kreiranje objekata

/**
 * Klasa može imati:
 * <li>1. polja</li>
 * <li>2. funkcije/metode</li>
 * FUNKCIJA : šta je FUNKCIJA ?
 * <p>
 * FUNKCIJA je blok koda koji se izvršava kad ga neko pozove.
 * </p>
 * <li>3. KONSTRUKTOR
 * Šta je to konstruktor i čemu služi ?
 * <p>
 * KONSTRUKTOR - način na koji kreiramo objekte
 * <p>
 * Naslijedili smo konstruktor bez param. new Movie();
 * Možemo li promijeniti i definirati svoj konstruktor.
 * </p>
 * </p>
 * </li>
 */
public class Movie {
    private String director;
    //Šta ako želim ograničiti nekoga sa unosom vrijednosti ?
    //npr. rating values idu u range od 0 - 10
    private int rating;
    private String title;

    //Konstruktor
    // modifikator_vidljivosti UVIJEK ide NAZIV_KLASE ( params )
    public Movie(String naslov, String reziser) {
        this.title = naslov;
        this.director = reziser;
    }

    // modifikator_vidljivosti povratni_tip ime_funkcije( params   )
    public void setRating(int ocjena) {
        if (ocjena >= 10) {
            this.rating = 10;
        } else if (ocjena <= 0) {
            this.rating = 0;
        } else {
            this.rating = ocjena;
        }
    }

    //modifikator_vidljivosti povratni_tip(int) naziv_funkcije () -> povratni ili return
    public int getRating() {
        return rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Naslov: " + this.title + " - Režiser: " + this.director + " - Rating: " + this.rating;
    }
}
