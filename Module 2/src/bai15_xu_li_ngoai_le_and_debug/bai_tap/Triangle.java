package bai15_xu_li_ngoai_le_and_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args)  {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hãy nhập a:");
        int a=  scanner.nextInt();
        System.out.println("Hãy nhập b:");
        int b= scanner.nextInt();
        System.out.println("Hãy nhập c:");
        int c= scanner.nextInt();
        try {
            Triangle tria= new Triangle();
            tria.checkTriangle(a,b,c);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (Exception ex){
            System.out.println("Sai nhé");
        }
        scanner.close();
    }
    public void checkTriangle( int a,int b, int c)  throws IllegalArgumentException{
        if (a+b<=c || a+c<=b || b+c<=a) {
            throw new IllegalArgumentException("Lỗi: Tam giác k hợp lệ");
        }else {
            System.out.println("Đây là tam giác");
        }
    }
}



