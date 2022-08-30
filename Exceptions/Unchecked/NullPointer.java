package Exceptions.Unchecked;

import Exceptions.UserDefined.WrongNameException;
import Interfaces.ShapeLab.IShape2;
import Interfaces.ShapeLab.ShapeFactory;

import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;

public class NullPointer {

    public void ShapeNull() throws WrongNameException {
        ShapeFactory factory = new ShapeFactory();
        String shapeName = "something";

            IShape2 shape = null;
            try {
                shape = factory.GetShape(shapeName);
            } catch (WrongNameException e) {
                e.printStackTrace();
                throw e;
            }

           shape.Introduce();

    }


    public void nullExceptionFirst() {
        try {
            FileReader file = new FileReader("pom.xml");
            file = null;

            file.read();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
        } catch (IOException e) {
            //Alternate logic
            e.printStackTrace();
        }
    }

}
