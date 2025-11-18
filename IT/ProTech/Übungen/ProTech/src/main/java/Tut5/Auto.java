package Tut5;

public class Auto {
    private String marke;
    private int baujahr;

    public Auto(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public static void main(String[] args) {
        Auto car1 = new Auto("mercedes", 2022);
        car1.starten();
        car1.ausgeben();
    }

    public void starten(){
        System.out.println("Das Auto startet!");
    }

    public void ausgeben(){
        System.out.println("Marke: " + marke + "Baujahr: " + baujahr);
    }
}
