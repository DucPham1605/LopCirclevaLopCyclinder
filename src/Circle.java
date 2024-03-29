public class Circle {
    private double radius = 1.0;
    private String color = "green";
    private boolean filled = true;

    public Circle(){
    }

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + " is filled with "
                + getColor() + " color.And area is " + getArea() + ", perimeter is "+getPerimeter();
    }
}
