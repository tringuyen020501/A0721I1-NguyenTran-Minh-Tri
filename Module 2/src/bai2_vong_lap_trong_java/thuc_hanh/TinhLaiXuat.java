package bai2_vong_lap_trong_java.thuc_hanh;


import java.util.Scanner;

public class TinhLaiXuat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate=1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("nhập tiền cần gởi");
        money = input.nextDouble();

        System.out.println("nhập số tháng:");
        month =input.nextInt();

        System.out.println("nhập lãi xuất");
        interestRate =scanner.nextDouble();

        double total= 0;
        for (int  i =0; i<month;i++){
            total+= money*(interestRate/100)/12 *month;
        }
        System.out.println("lãi xuất nhận được là:" + total);
    }

}
