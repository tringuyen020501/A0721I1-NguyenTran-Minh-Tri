package bai1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float usd;
        System.out.println("nhập tiền Đô:");
        usd =scanner.nextFloat();
        float vnd= usd*23000;
        System.out.println("Tiền việt là:" +vnd);
    }
}
