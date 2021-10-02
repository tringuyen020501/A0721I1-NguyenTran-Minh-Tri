package bai1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  weight, height, bmi;
        System.out.println("cân nặng của bạn:");
        weight= scanner.nextDouble();

        System.out.println("chiều cao của bạn:");
        height= scanner.nextDouble();

        bmi= weight/Math.pow(height,2);
        System.out.println(bmi);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.println("bmi:"+ bmi+ "Underweight");
        else if (bmi < 25.0)
            System.out.println("bmi:"+ bmi+ "Normal");
        else if (bmi < 30.0)
            System.out.println("bmi:"+ bmi+ "Overweight");
        else
            System.out.println("bmi:"+ bmi+ "Obese");
    }
}
