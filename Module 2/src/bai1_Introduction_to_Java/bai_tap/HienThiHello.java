package bai1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class HienThiHello {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("hello:"+ name);
    }
}
