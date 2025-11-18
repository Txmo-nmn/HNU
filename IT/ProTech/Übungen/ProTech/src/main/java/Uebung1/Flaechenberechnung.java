package Uebung1;
import java.util.Scanner;

public class Flaechenberechnung {
    public static void main(String[] args) {
        double seiteA;
        double seiteB;
        double flaeche;
        double umfang;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gib die länger der ersten Seite ein");
        seiteA = sc.nextDouble();
        System.out.println("Bitte gib die länger der zweiten Seite ein");
        seiteB = sc.nextDouble();

        flaeche = seiteA * seiteB;
        System.out.println("Die Fläche des Rechteckes beträgt "+flaeche+" cm^2.");

        umfang = 2*seiteA + 2*seiteB;
        System.out.println("Der umfang des Rechteckes beträgt "+ umfang +" cm.");
    }
}
