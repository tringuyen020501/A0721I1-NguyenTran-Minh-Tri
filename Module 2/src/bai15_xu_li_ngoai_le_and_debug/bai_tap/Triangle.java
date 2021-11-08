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
        Triangle tria= new Triangle();
        try {
            tria.checkTriangle(a,b,c);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void checkTriangle( int a,int b, int c) throws IllegalArgumentException {
        //try{
            if (a+b<=c || a+c<=b || b+c<=a) {
                throw new IllegalArgumentException("Lỗi: Tam giác k hợp lệ");
            }else {
                System.out.println("Đây là tam giác");
            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}



