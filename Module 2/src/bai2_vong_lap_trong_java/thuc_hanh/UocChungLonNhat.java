package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner input= new Scanner(System.in);
        System.out.println("nhập  a:");
        a= input.nextInt();
        System.out.println("nhập  a:");
        b= input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);

        if (a==0||b==0){
            System.out.println("k có số nào thỏa mãn");
        }
        while (a!=b){
            if (a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        System.out.println("UCLN :" + a);
    }
}
