package Bai1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> ListSample = new ArrayList<Product>();


        Product Pro1 = new Product(101,"Sp1", "Ko an dc", 100);
        Product Pro2 = new Product(102, "Sp2", "An ko ngon", 150);
        Product Pro3 = new Product(103, "Sp3", "Tua-vit", 200);

        ListSample.add(Pro1);
        ListSample.add(Pro2);
        ListSample.add(Pro3);


        for (int i = 0; i < ListSample.size(); i++){
            System.out.println(ListSample.get(i));
        }
        

        ListSample.remove(0);


    }

}
