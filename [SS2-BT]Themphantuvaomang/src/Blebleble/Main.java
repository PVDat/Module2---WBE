package Blebleble;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        int sizeOfarr;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng ban đầu: ");
        sizeOfarr = sc.nextInt();
        arr = new int[sizeOfarr];
        int option;
        do {
            System.out.println("Menu.");
            System.out.println("1. Thay đổi độ dài mảng");
            System.out.println("2. Thay đổi giá trị phần tử");
            System.out.println("3. Xuất/hiển thị mảng");
            System.out.println("0. Exit");
            System.out.println("Chọn lệnh: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Mời nhập độ dài mảng: ");
                    sizeOfarr = sc.nextInt();
                    arr = new int[sizeOfarr];
                    break;
                case 2:
                    System.out.println("Nhập vị trí của phần tử muốn đổi giá trị: ");
                    index = sc.nextInt() -1;
                    System.out.println("Nhập giá trị phần tử: ");
                    arr[index] = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Ta có mảng số nguyên như sau: "+ Arrays.toString(arr));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (option != 0);
    }
}