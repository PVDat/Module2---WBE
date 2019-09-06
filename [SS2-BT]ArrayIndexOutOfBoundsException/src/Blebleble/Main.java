package Blebleble;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arrExample = createArr();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arrExample[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

    public static int[] createArr(){
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i=0; i<100; i++){
            arr[i]= rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}

