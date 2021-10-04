package bai1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("OK");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("năm nhận là:" + year);
        } else {
            System.out.println("năm k nhuận là:" + year);
        }
    }
}
