import java.util.ArrayList;

public class Deck {
    ArrayList<Object> valores = new ArrayList<>();
    ArrayList<Object> palos = new ArrayList<>();

    public Deck() {
        createDeck();
    }

    public void createDeck(){
        for (int i = 2 ; i <= 10 ; i++){
            valores.add(i);
        }
        valores.add("A");
        valores.add("J");
        valores.add("Q");
        valores.add("K");
        palos.add("Tréboles");
        palos.add("Corazones");
        palos.add("Picas");
        palos.add("Diamantes");

        ArrayList cards = new ArrayList<Card>();
        /*
        for (int j = 0 ; j <= 4 ; j++) {
            for (int i = 0 ;i <= 52 ; i++ ){
                cards.add(new Card(valores.get(i), palos.get(j)));
            }
        }

         */
    }

    public void shuffle(){
        System.out.println("Se mezcló el deck");
    }

    public void head () {

    }

    public void pick () {

    }
    public void hand() {

    }
}
