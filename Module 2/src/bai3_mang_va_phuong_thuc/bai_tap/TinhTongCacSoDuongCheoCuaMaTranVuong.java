package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoDuongCheoCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int sum = 0;
        System.out.println("nhập vào bậc");
        m = scanner.nextInt();

        int arr[][] = new int[m][m];
        System.out.println("nhập các phần tử:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ma trận vuông vừa nhập là:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử ở đường chéo chính là:" + sum);
    }
}
