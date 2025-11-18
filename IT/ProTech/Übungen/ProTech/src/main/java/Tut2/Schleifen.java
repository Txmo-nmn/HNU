package Tut2;

public class Schleifen {
    public static void main(String[] args) {
        geradeZ();
        ungeradeZ();
    }

    public static void geradeZ(){
        int zahl = 0;
        while (zahl <=10){
            System.out.println(zahl);
            zahl+= 2;
        }
    }

    public static void ungeradeZ(){
        int zahl = 3;
        do {
            if (zahl %2 == 1){
                System.out.println(zahl);
            }
            zahl++;
        } while(zahl <= 10);
    }
}
