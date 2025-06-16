import java.util.Scanner;

public class Esr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        int x = scanner.nextInt();
        System.out.println("inserisci il secondo numero");
        int y = scanner.nextInt();

        System.out.println("ecco il tuo risultato: "+ (x+y));
        System.out.println("insersci una parola");
        String stringa= scanner.next();
        System.out.println("La string inserita è: " + stringa);
        System.out.println(stringa + (x+y));

        scanner.close();
    }
}
