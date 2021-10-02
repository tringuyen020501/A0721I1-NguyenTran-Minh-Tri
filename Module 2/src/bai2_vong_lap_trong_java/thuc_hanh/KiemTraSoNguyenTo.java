package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+" "+"k la SNT");
        }else {
            int i=2;
            boolean check = true;
            while (i<Math.sqrt(number)){
                if (number%i==0){
                    check = false;
                }
                i++;
            }
            if (check)
                System.out.println(number+" "+"is SNT");
            else
                System.out.println(number+ "not SNT");
        }
    }
}
