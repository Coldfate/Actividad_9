import javax.crypto.spec.DESedeKeySpec;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean repeat = false;
        Scanner scan = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Seleccionar otra opción? (s/n)");
            String res = scan.next();
            switch (res) {
                case "s":
                    repeat = false;
                    break;
                case "n":
                    repeat = true;
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
            }
        }while(!repeat);
    }

    public static int showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Poker!\nSelecciona una opción:\n1 Mezclar deck\n2 Sacar una carta\n3 Carta al azar\n" +
                "4 Generar una mano de 5 cartas\n0 Salir");

        int res = sc.nextInt();
        switch (res) {
            case 1:
                Deck shuffle = new Deck();
                shuffle.shuffle();
                break;
            case 2:
                Deck head = new Deck();
                head.head();
                break;
            case 3:
                Deck pick = new Deck();
                pick.pick();
                break;
            case 4:
                Deck hand = new Deck();
                hand.hand();
                break;
        }
        return res;
    }
}
