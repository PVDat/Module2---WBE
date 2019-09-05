package Blebleble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation qS = new QuadraticEquation(a, b, c);
        qS.getRoot1();
        qS.getRoot2();
        if (qS.delta > 0){
            System.out.println("the equation has 2 roots: " + qS.root1+" and "+ qS.root2);
        }else
            if (qS.delta == 0){
            System.out.println("the equation has 1 root: "+qS.root1);
        }else {
                System.out.println("the equation has no root");
            }

    }
}
