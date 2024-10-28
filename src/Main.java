import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lunghezza percorso: ");
        int lunghezza = scanner.nextInt();
        scanner.nextLine();
        Maneggio maneggio = new Maneggio(lunghezza);

        System.out.println("Numero dei cavalli: ");
        int nCavalli = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nCavalli; i++) {
            System.out.println("Nome cavallo no. " + (i+1) + ": ");
            String nome = scanner.nextLine();
            maneggio.aggiungi(nome);
        }
        scanner.close();

        maneggio.go();

    }
}