package bai6_ke_thua.bai_tap;

public class Circle {
    public String color="red";
    public int radius =50;


    public Circle(String color, int radius){
        this.color=color;
        this.radius=radius;
    }
    public Circle(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A circle is"
                +getColor()
                + "radius"
                +getRadius()
                +"Area"
                ;
    }

}
