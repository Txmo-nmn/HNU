package Uebung1;

public class Wahlergebnis {
    public static void main(String[] args) {
        int stimmenSchmidt = 200;
        int stimmenHuber = 1200;
        int stimmenHintergruber = 600;
        int gesammt = 3246;

        int gesamtStimmen = stimmenSchmidt + stimmenHuber + stimmenHintergruber;
        double wahlbeteiligung = ((double) gesamtStimmen / gesammt) * 100;
        double ProzentS = ((double) stimmenSchmidt / gesammt) * 100;
        double ProzentHu = ((double) stimmenHuber / gesammt) * 100;
        double ProzentHi = ((double) stimmenHintergruber / gesammt) * 100;

        System.out.println("Wahlbeteiligung: " + wahlbeteiligung + "%");
        System.out.println("Stimmenanteil Herr Schmidt: " + ProzentS + "%");
        System.out.println("Stimmenanteil Frau Huber: " + ProzentHu + "%");
        System.out.println("Stimmenanteil Herr Hintergruber: " + ProzentHi + "%");
    }
}
