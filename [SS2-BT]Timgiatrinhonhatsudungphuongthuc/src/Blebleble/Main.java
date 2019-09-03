package Blebleble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        int sizeOfArr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập độ dài của mảng số: ");
        sizeOfArr = sc.nextInt();
        arr = new int[sizeOfArr];

        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập phần tử thứ "+(i+1)+":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Ta có mảng số nguyên sau: ");
        for (int j =1; j < arr.length; j++){
            System.out.print(arr[j]+ "\t");
        }
        int min = arr[0];
        int index = 1;
        for (int j =0; j < arr.length; j++){
            if (arr[j] < min) {
                min = arr[j];
                index = j+1;
            }
        }
        System.out.println("Số có giá trị nhỏ nhất trong mảng là "+min+" ở vị trí thứ "+index );

    }
}
