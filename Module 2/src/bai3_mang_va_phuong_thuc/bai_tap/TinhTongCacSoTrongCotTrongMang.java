package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoTrongCotTrongMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int m,n;
        int sum=0;
        System.out.println("nhập số dòng:");
        m= scanner.nextInt();
        System.out.println("nhập số cột:");
        n=scanner.nextInt();
        int[][] arr=new int[m][n];
        for (int i =0; i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("arr["+i+"]"+"["+j+"]"+":");
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int i =0; i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }

        for (int i=0;i<m;i++){
            for (int j =0; j<n;j++){
                if (j>i){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
