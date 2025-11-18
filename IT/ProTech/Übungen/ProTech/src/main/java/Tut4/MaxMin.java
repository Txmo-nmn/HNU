package Tut4;

public class MaxMin {
    public static void main(String[] args) {
       int[] Zahlen = {1,2,3,4,5};
       System.out.println(max(Zahlen));
        System.out.println(min(Zahlen));
    }

    public static int max(int[] Zahlen){
        int maxZahl = 0;
        for (int i = 0; i < Zahlen.length; i++) {
            if(maxZahl < Zahlen[i]){
                maxZahl = Zahlen[i];
            }
        }
        return maxZahl;
    }

    public static int min(int[] Zahlen){
        int minZahl = Zahlen[0];
        for (int i = 0; i < Zahlen.length; i++) {
            if(minZahl > Zahlen[i]){
                minZahl = Zahlen[i];
            }
        }
        return minZahl;
    }
}
