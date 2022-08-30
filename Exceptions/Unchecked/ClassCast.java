package Exceptions.Unchecked;

import Interfaces.Shape.Circle;
import Interfaces.Shape.IAngle;
import Interfaces.Shape.IShape;
import Interfaces.Shape.Square;

public class ClassCast {

    private IAngle getAngleShape(IShape shape){
        return (IAngle)shape;
    }

    public IAngle getAngleCircle(){
        IShape circle = new Circle(7);
        IAngle circleAngel = (IAngle) circle;
        return circleAngel;
    }

    public IAngle getAngleSquare(){
        IShape square = new Square(7);
        IAngle squareAngel = (IAngle) square;
        return squareAngel;
    }

}
