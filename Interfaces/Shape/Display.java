package Interfaces.Shape;

import java.text.MessageFormat;

public class Display {
    public void printAreaEnvironment (IShape shape){

        System.out.println(MessageFormat.format("the name of the shape: {0} ", shape.getName()));
        System.out.println(MessageFormat.format("the Area of the shape: {0} ", shape.getArea()));
        System.out.println(MessageFormat.format("the Environment of the shape: {0} ", shape.getEnvironment()));
    }
}
