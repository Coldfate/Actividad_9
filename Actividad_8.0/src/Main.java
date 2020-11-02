import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = false;

        Scanner scan = new Scanner(System.in);
        try {
            showMenu();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        do {
            System.out.println("Seleccionar otra opción? (s/n)");
            String res = scan.next();
            switch (res) {
                case "s" -> showMenu();
                case "n" -> repeat = true;
                default -> System.out.println("Selecciona una opcion valida");
            }
        }while (!repeat);
    }

    public static void showMenu() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Poker!\nSelecciona una opción:\n1 Mezclar deck\n2 Sacar una carta\n3 Carta al azar\n" +
                "4 Generar una mano de 5 cartas\n0 Salir");

        int res = sc.nextInt();

        switch (res) {
            case 1 -> {
                Deck shuffle = new Deck();
                shuffle.shuffle();
            }
            case 2 -> {
                Deck head = new Deck();
                head.head();
            }
            case 3 -> {
                Deck pick = new Deck();
                pick.pick();
            }
            case 4 -> {
                Deck hand = new Deck();
                hand.hand();
            }
            case 0 -> System.exit(0);
            default -> throw new Exception("Opción no valida");
        }

    }
}
