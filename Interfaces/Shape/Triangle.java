package Interfaces.Shape;

public class Triangle implements  IShape, IAngle{

    public Triangle(){}

    public Triangle(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double x;
    double y;
    double z;


    @Override
    public double getArea() {
       return x*y/2;
    }

    @Override
    public double getEnvironment() {
        return x+y+z ;
    }

    @Override
    public double AngleAccumulation() {
        return 180;
    }
}
