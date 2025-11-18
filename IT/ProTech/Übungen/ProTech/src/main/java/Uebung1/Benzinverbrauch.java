package Uebung1;
import java.util.Scanner;

public class Benzinverbrauch {
    public static void main(String[] args) {
        double strecke;
        double verbrauch;
        double durchschnitt;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gib die länger der Strecke ein");
        strecke = sc.nextDouble();
        System.out.println("Bitte gib den Verbrauch ein");
        verbrauch = sc.nextDouble();

        durchschnitt = (verbrauch / strecke) * 100;
        System.out.println("Durchschnittsverbrauch: " + durchschnitt + " Liter pro 100 km");
    }
}
