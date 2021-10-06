package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimMinTrongMangHaiChieu {
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
        int min=arr[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (min>arr[i][j])
                    min=arr[i][j];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng:" +min);

    }
}
