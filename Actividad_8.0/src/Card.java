

public class Card{
    String Valor;
    String Palo;
    String Color;

    public Card() {
        String Carta = Valor, Palo, Color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Valor='" + Valor + '\'' +
                ", Palo='" + Palo + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
