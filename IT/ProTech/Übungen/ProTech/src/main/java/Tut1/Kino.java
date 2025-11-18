package Tut1;

public class Kino {
    public static void main(String[] args) {
        int gesammtsitz = 120;
        int besetztsitz = 60;
        int freisitz;
        double belegtProz;

        freisitz = gesammtsitz - besetztsitz;
        belegtProz = (double) besetztsitz / gesammtsitz * 100;

        System.out.println("Es sind: "+freisitz+" Sitze frei.\nDas sind "+belegtProz+ "%");
    }
}
