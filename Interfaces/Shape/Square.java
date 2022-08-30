package Interfaces.Shape;

public class Square implements IShape, IAngle{

    public Square(double x){
        this.side = x;
    }

    public Square(){}


    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getEnvironment() {
        return 4 * side;
    }

    @Override
    public double AngleAccumulation() {
        return 360;
    }
}
