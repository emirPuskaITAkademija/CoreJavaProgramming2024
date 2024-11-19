package five.loops;

public class ContinueDemo {
    public static void main(String[] args) {
        //String -> nit karaktera char[]
        String recenica = "Petar Pan je pojeo paprike. Pohvalio se kako može paprika puno pojest.";
        char[] slovaRecenice = recenica.toCharArray();
        char slovo = 'p';
        int brojPojavljivanjaSlovaP = 0;
        for(int korak = 0; korak <slovaRecenice.length; korak++){
            char znakIzRecenice = slovaRecenice[korak];
            if(znakIzRecenice != slovo){
                continue;
            }
            brojPojavljivanjaSlovaP++;
        }
        System.out.println("Slovo 'p' se nalazi u rečenici " + brojPojavljivanjaSlovaP+" puta");
    }
}
