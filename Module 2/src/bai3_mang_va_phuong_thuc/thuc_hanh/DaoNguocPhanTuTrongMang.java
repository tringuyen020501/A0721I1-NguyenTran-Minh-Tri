package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("Size does not exceed 20");
        }while (size>20);
        arr = new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("Enter element" +( i + 1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j <arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
