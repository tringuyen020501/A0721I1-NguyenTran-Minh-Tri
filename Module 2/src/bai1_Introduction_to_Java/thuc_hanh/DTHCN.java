package bai1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class DTHCN {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner= new Scanner(System.in);

        System.out.println("nhap chieu rong");
        width = scanner.nextFloat();

        System.out.println("nhap chieu dai");
        height = scanner.nextFloat();
        float area = width*height;

        System.out.println("Area is:" +area);

    }
}
