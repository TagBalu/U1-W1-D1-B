import java.util.Scanner;

public class Esr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Inserisci il primo valore");
        double LatoA = scanner.nextDouble();
        System.out.println("Inserisci il secondo valore ");
        double LatoB = scanner.nextDouble();
        System.out.println("Inserisci il terzo valore");
        double LatoC = scanner.nextDouble();
        System.out.println("Ecco il perimetro del tuo triangolo : " +(LatoA+LatoB+LatoC) );
        double P=LatoA+LatoB+LatoC;
        if (P % 2== 0){
            System.out.println("0 è pari" );
        } else {
            System.out.println("1 è dispari");
        }

        double A=Math.sqrt(P*(P-LatoA)*(P-LatoB)*(P-LatoC));
        System.out.println("Ecco l'area del triangolo con il metodo di Erone: " + A);

        scanner.close();
    }
}
