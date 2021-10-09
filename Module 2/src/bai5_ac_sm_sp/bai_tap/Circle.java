package bai5_ac_sm_sp.bai_tap;

public class Circle {
    private static double radius;
    private String color;
    public double area;
    Circle(double radius, String color){
        radius=1.0;
        color="red";
    }
    static void change(){
        radius=4.0;
    }

    public Circle() {
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.area=Math.pow(radius,2)*Math.PI;
    }
}
