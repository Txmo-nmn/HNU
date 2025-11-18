package Tut3;

public class Rechnen {
    public static void main(String[] args) {
        System.out.println(addieren(1,3));
        System.out.println(subtrahieren(5,2));
    }

    public static double addieren(double zahl1, double zahl2){
        return zahl1 + zahl2;
    }
    public static double subtrahieren(double zahl1, double zahl2){
        return zahl1 - zahl2;
    }
}
