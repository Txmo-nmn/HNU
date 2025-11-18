package Tut2;

public class BedingteAnweisung {
    public static void main(String[] args) {
        alter();
        noten();
        wochentage();
    }

    public static void alter() {
        int alter = 18;

        if (alter >= 18) {
            System.out.println("volljährig");
        } else {
            System.out.println("minderjährig");
        }
    }

    public static void noten() {
        int note = 1;

        if (note == 1) {
            System.out.println("sehr gut");
        } else if (note == 2) {
            System.out.println("gut");
        } else if (note == 3) {
            System.out.println("befriedigend");
        } else if (note == 4) {
            System.out.println("ausreichend");
        } else if (note == 5) {
            System.out.println("mangelhaft");
        } else if (note == 6) {
            System.out.println("ungenügend");
        } else {
            System.out.println("ungültige Note");
        }
    }

    public static void wochentage(){
        int wochentag = 1;

        switch (wochentag){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("ungültige Note");
                break;
        }
    }
}