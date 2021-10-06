package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double fara;
        double celsi;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Fara to celsi");
            System.out.println("2.celsi to Fara");
            System.out.println("0.Exit");
            System.out.println("mời bạn chọn menu");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("nhập nhiệt độ fara");
                    fara=scanner.nextDouble();
                    System.out.println("fara to celsi is:"+faraTocelsi(fara));
                    break;
                case 2:
                    System.out.println("nhập nhiệt độ celsi");
                    celsi=scanner.nextDouble();
                    System.out.println("celsi to fara is:"+celsiToFara(celsi));
                    break;
                case 0:
                    System.out.println(0);
            }
        }while (choice!=0);

    }
    public static double celsiToFara(double celsi){
        double fara1= (9.0/5)*celsi+32;
        return  fara1;
    }
    public static double faraTocelsi(double fara){
        double celsi1=(5.0/9)*(fara -32);
        return celsi1;
    }
}
