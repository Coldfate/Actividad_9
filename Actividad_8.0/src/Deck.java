import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Deck {
    ArrayList<Object> valores = new ArrayList<>();
    ArrayList<Object> palos = new ArrayList<>();
    ArrayList<Object> color = new ArrayList<>();
    Stack<Integer> cards = new Stack<>();

    public Deck() {
        createDeck();
    }
    public void createDeck() {
        for (int i = 2; i <= 10; i++) {
            valores.add(i);
        }
        for (int i = 0 ; i<= 52 ; i++){
            cards.push(i);
        }

        valores.add("A");
        valores.add("J");
        valores.add("Q");
        valores.add("K");
        palos.add("Tréboles");
        palos.add("Corazones");
        palos.add("Picas");
        palos.add("Diamantes");
        color.add("Rojo");
        color.add("Negro");

    }

    public void shuffle(){
        System.out.println("Se mezcló el deck");
    }

    public void head() throws Exception{
        Random rd = new Random();
        System.out.print(palos.get(rd.nextInt(color.size())) + " ");
        System.out.print(color.get(rd.nextInt(color.size())) + " ");
        Object index   = valores.get(rd.nextInt(valores.size()));
        System.out.println(index + " \n");
        System.out.println("Quedan " + cards.pop() + " cartas");
        if (cards.isEmpty()){
            throw new Exception("Se han agotado las cartas");
        }
    }

    public void pick() throws Exception {
        Random rd = new Random();
        System.out.print(palos.get(rd.nextInt(color.size())) + " ");
        System.out.print(color.get(rd.nextInt(color.size())) + " ");
        Object index  = valores.get(rd.nextInt(valores.size()));
        System.out.println(index + " \n");
        cards.pop();
        System.out.println("Quedan " + cards.size() + " cartas");
        if (cards.isEmpty()){
            throw new Exception("Se han agotado las cartas");
        }
    }
    public void hand() throws Exception{
        Random rd = new Random();
        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i + " ");
            System.out.print(palos.get(rd.nextInt(color.size())) + " ");
            System.out.print(color.get(rd.nextInt(color.size())) + " ");
            Object index  = valores.get(rd.nextInt(valores.size()));
            System.out.println(index + "");
            cards.pop();
        }
        System.out.println("Quedan " + cards.size() + " cartas");
        if (cards.isEmpty()){
            throw new Exception("Se han agotado las cartas");
        }
    }
}
