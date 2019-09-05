package Blebleble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Rectangle R1 = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ R1.display());
        System.out.println("Perimeter of the Rectangle: "+ R1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ R1.getArea());

    }
}
