package Uebung1;
import java.util.Scanner;

public class Arbeitszeit {
    public static void main(String[] args) {
        int arbeitszeit;
        double arbeitszeitStunden;
        double stundenlohn = 12.5;
        double lohn;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gib die Arbeitszeit ein");
        arbeitszeit = sc.nextInt();

        arbeitszeitStunden = (double) arbeitszeit / 60;
        System.out.println("Die Arbeitzeit beträgt: " +arbeitszeitStunden+ " Stunden.");

        //lohn = stundenlohn * arbeitszeitStunden;
        lohn = stundenlohn / 60;                //Stundenlohn auf Minutenlohn runterrechnen
        lohn = lohn * arbeitszeit;
        System.out.println("Der Arbeiter bekommt: "+lohn+ " Euro.");
    }
}
