public class Cyclinder extends Circle {
    private double height = 2.0;

    public Cyclinder(){
    }

    public Cyclinder(double height){
        this.height = height;
    }

    public Cyclinder(double height,double radius,String color,boolean filled){
        super(radius,color,filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public double getArea(){
        return 2*Math.PI* getRadius() * this.height;
    }

    public double getVolume(){
        return Math.PI * getRadius()*getRadius()*this.height;
    }

    @Override
    public String toString(){
        return "A Cycline with radius="
                + getRadius()
                + " is filled with "
                + getColor() + " color.And area is " + getArea() + ", volume is "+getVolume();
    }
}
