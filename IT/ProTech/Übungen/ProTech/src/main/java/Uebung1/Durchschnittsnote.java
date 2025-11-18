package Uebung1;

public class Durchschnittsnote {
    public static void main(String[] args) {
        double noteMathe = 1.7;
        int ectsMathe = 6;

        double noteInformatik = 2.3;
        int ectsInformatik = 5;

        double notePhysik = 2.0;
        int ectsPhysik = 4;

        double noteEnglisch = 1.3;
        int ectsEnglisch = 3;

        double summeNotenECTS = noteMathe * ectsMathe
                + noteInformatik * ectsInformatik
                + notePhysik * ectsPhysik
                + noteEnglisch * ectsEnglisch;

        int summeECTS = ectsMathe + ectsInformatik + ectsPhysik + ectsEnglisch;

        double durchschnitt = summeNotenECTS / summeECTS;

        // Ausgabe des Ergebnisses auf 2 Nachkommastellen gekürzt
        System.out.printf("Vorläufiger Notendurchschnitt: %.2f\n", durchschnitt);
    }
}

