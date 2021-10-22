package bai6_ke_thua.bai_tap;

class Cylinder extends  Circle{
    public int height=100;
    public double area ;

    public void Area(){
         this.area=Math.pow(this.radius,2)*Math.PI;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "A Cylinder color is"
                +getColor()
                +"is radius"
                +getRadius()
                +"height"
                +getHeight();
    }
}
