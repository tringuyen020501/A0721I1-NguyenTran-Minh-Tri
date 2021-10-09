package bai4_lop_doi_tuong.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    double a, b, c ,d,r1,r2;
    private PhuongTrinhBacHai(double a, double b, double c){
           this.a= a;
           this.b=b;
           this.c=c;
           this.d=d;
           this.r1=r1;
           this.r2=r2;
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }
    private double getDelta(){
        return this.d= Math.pow(this.b,2)-4*this.a*this.c;
    }
    private double getRoot1(){
        return this.r1=(-this.b+Math.sqrt((Math.pow(b,2)-4*this.a*this.c)))/2*this.a;
    }
    private double getRoot2(){
        return this.r2=(-this.b-Math.sqrt((Math.pow(b,2)-4*this.a*this.c)))/2*this.a;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhập a:");
        double a= scanner.nextDouble();
        System.out.print("nhập b:");
        double b= scanner.nextDouble();
        System.out.print("nhập c:");
        double c= scanner.nextDouble();
        PhuongTrinhBacHai phuongTrinhBacHai= new PhuongTrinhBacHai(a,b,c);
        System.out.println("Delta:" +phuongTrinhBacHai.getDelta());
        System.out.println("nghiệm 1:" +phuongTrinhBacHai.getRoot1());
        System.out.println("nghiệm 2:" +phuongTrinhBacHai.getRoot2());

    }
}
