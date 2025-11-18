package Vorlesung3;

public class TypUmwandlung {
    public static void main(String[] args) {
        double dZahl = 7.5;
        int gZahl = 5;

        gZahl = (int) dZahl;

        System.out.println(gZahl + " " + dZahl);

        String[] Name = new String[4];

        Name[0] = "Tom";
        Name[2] = "Tim";
        Name[3] = "Timo";

        for (int i = 0; i < Name.length; i++) {
            System.out.println(Name[i]);
        }
        for (String i : Name){
            System.out.println(i);
        }

        int day = 3;
        switch(day) {
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
            default:
                System.out.println("kein Arbeitstag");
        }

    }
}
