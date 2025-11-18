package Tut1;
import java.util.Scanner;

public class Mehrwertsteuer {
    public static void main(String[] args) {
        double mwst = 1 + 19.0/100;
        double grundwert;
        double endwert;

        System.out.println("Bitte gib einen Startwert ein:");

        Scanner sc = new Scanner(System.in);
        grundwert= sc.nextDouble();
        endwert = grundwert * mwst;

        System.out.println("Die Mehrwertsteuer beträgt: " + endwert + "€");
    }
}
