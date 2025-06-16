import java.util.Scanner;

public class Esr2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("insersici la tua prima string ");
        String A =scanner.next();
        System.out.println("inserisci la tua seconda string ");
        String B = scanner.next();
        System.out.println("inserisci la tua terza string ");
        String C = scanner.next();

        System.out.println(A+" "+B+" "+C);
        System.out.println(C+" "+B+" "+A);
        scanner.close();
    }
}
