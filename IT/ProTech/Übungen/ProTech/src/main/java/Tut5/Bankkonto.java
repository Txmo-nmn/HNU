package Tut5;

public class Bankkonto {
    private String kontonummer;
    private double kontostand;

    public Bankkonto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("123", 0);
        konto1.einzahlen(100);
        konto1.auszahlen(50);
        konto1.zeigeKontostand();
    }

    public void einzahlen(double betrag){
        kontostand += betrag;
    }

    public void auszahlen(double betrag){
        kontostand -= betrag;
    }

    public void zeigeKontostand(){
        System.out.println(kontostand);
    }
}
