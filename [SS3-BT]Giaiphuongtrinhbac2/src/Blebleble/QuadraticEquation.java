package Blebleble;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    protected double delta;
    protected double root1;
    protected double root2;


    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return delta = b*b-4*a*c;
    }

    public double getRoot1() {
        return root1 = (-b+Math.sqrt(delta))/(2*a);
    }

    public double getRoot2() {
        return root2 = (-b-Math.sqrt(delta))/(2*a);
    }
}
