package Interfaces.ShapeLab;

import Exceptions.UserDefined.WrongNameException;
import Interfaces.Shape.IShape;

import java.util.Locale;

public class ShapeFactory {
    public IShape2 GetShape(String shapeName) throws WrongNameException {
        switch (shapeName.toLowerCase()){
            case "circle" :
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":  //SQuare
                return new Square();
            default:
               throw new WrongNameException(shapeName + " is not a valid name!");
        }
    }
}
