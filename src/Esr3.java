import java.util.Scanner;

public class Esr3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insersici l1");
        double l1=scanner.nextDouble();
        System.out.println("insersici l2");
        double l2= scanner.nextDouble();
        double risultato=perimetroRettangolo(l1,l2);
        System.out.println("il perimetro è: "+ risultato);
        scanner.close();
    }
    public static double perimetroRettangolo (double l1,double l2){
        return 2*(l1+l2);

    }

}
