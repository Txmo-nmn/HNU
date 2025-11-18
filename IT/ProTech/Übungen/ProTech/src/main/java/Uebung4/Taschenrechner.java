package Uebung4;

public class Taschenrechner {
    private double value;

    public Taschenrechner(){
        value = 0;
    }

    public double getValue(){
        return value;
    }

    public void clear(){
        value = 0;
    }

    public void add(double a){
        value += a;
    }

}
