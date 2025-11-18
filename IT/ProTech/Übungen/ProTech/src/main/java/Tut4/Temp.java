package Tut4;

public class Temp {
    public static void main(String[] args) {
        System.out.println("59F ist " + inCellsius(59) + "°C");
        System.out.println("15°C ist " + inFahrenheit(15) + "F");
    }

    public static double inCellsius(double f){
        return ((f - 32)/1.8);
    }

    public  static double inFahrenheit(double c){
        return (c * 1.8) + 32;
    }
}
