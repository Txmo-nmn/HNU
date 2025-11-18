package Tut3;

public class GeradeZahl {
    public static void main(String[] args) {
        System.out.println(istZahlGerade(3));
    }

    public static boolean istZahlGerade(int zahl){
        if (zahl % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
