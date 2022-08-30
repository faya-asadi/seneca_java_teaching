package Interfaces.Shape;

public class Rectangle implements IShape, IAngle {

    double length;
    double width;

    public Rectangle(){}
    public Rectangle(double x, double y){
        this.length = y;
        this.width = x;
    }


    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getEnvironment() {
        return 2 * (length + width);
    }

    @Override
    public double AngleAccumulation() {
        return 360;
    }
}
