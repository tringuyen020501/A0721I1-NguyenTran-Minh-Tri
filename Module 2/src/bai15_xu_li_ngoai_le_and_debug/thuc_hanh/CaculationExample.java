package bai15_xu_li_ngoai_le_and_debug.thuc_hanh;

import java.util.Scanner;

public class CaculationExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Hãy nhập x:");
        int x= scanner.nextInt();
        System.out.print("Hãy nhập y:");
        int y= scanner.nextInt();
        CaculationExample calc= new CaculationExample();
        calc.caculator(x,y);
    }
    public void caculator(int x, int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng x+y ="+ a);
            System.out.println("Tổng x-y ="+ b);
            System.out.println("Tổng x*y ="+ c);
            System.out.println("Tổng x/y ="+ d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ:" +e.getMessage());
        }
    }
}
