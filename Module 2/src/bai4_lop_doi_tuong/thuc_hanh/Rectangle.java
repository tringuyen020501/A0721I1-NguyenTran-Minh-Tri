package bai4_lop_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap chieu rong:");
        double width= scanner.nextDouble();
        System.out.println("nhap chieu dai:");
        double height= scanner.nextDouble();
        Rectangle rectangle= new Rectangle(width,height);
        System.out.println("hcn :"+rectangle.Display());
        System.out.println("DT:" +rectangle.getArea());
        System.out.println("CV:"+rectangle.getPerimeter());
    }
    double width, height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String Display(){
        return "Rectagle{"+"width="+width+",height="+height+"}";
    }
}
