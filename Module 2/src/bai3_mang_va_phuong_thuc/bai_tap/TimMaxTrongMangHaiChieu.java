package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimMaxTrongMangHaiChieu {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập số dòng:");
        m=scanner.nextInt();
        System.out.println("nhập số cột:");
        n=scanner.nextInt();
        int arr[][]= new int[m][n];
        for (int i=0; i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("arr["+i+"]"+"["+j+"]"+":");
                arr[i][j]= scanner.nextInt();
            }
        }
        int max=arr[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (max<arr[i][j])
                    max=arr[i][j];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng:" +max);

    }
}
