package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hình Chữ Nhật:");
        for (int i=0; i<3;i++){
            for (int j =0; j<7;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Tam giác vuông:");
        for (int  i=0;i<=5;i++){
            for (int j =0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Tam giác vuông:");
        for (int i=6;i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Tam giác cân:");
        System.out.println("nhập chiều cao:");
        int n = scanner.nextInt();
        for (int i =1; i<=n; i++){
            for (int k =n; k>i;k--){
                System.out.print(" ");
            }
            for (int j =1;j<=i*2 - 1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
