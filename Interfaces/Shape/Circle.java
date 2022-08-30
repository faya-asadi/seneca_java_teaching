package Interfaces.Shape;

public class Circle implements  IShape{

    public Circle(){}

    public Circle(double r){

        this.radius = r;
    }

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * 3.14;
    }

    @Override
    public double getEnvironment() {
        return radius * 2 * 3.14;
    }
}
