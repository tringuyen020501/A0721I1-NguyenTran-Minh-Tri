package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoaMang {
    public static void main(String[] args) {
        int size, c;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size mảng");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("mảng phải nhỏ hơn 20 nha");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Giá Trị vị trí " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("giá trị của mảng");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("nhập số cần xóa:");
        int x = scanner.nextInt();

        for (c = i = 0; i < size; i++) {
            if (arr[i] != x) {
                arr[c] = arr[i];
                c++;
            }
        }
        size = c;
        System.out.println("mảng còn lại là:");
        for (int j = 0; j < size; j++) {
            System.out.println(arr[j] + "\n");
        }
    }
}
