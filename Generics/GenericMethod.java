package Generics;

import Exceptions.UserDefined.SizeDifferenteException;
import Exceptions.UserDefined.WordGame;
import Generics.Goods.Goods;
import Interfaces.Shape.IShape;

import java.util.HashMap;
import java.util.List;

public class GenericMethod {

    public static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static <T extends Goods> void changeName(T item){
       String name = item.getName();
       String[] splitName = name.split("_");
       if(splitName.length > 1){
           name = String. join(" ", splitName);
           item.setName(name);
       }
    }


    /*Write a method that gets two generic lists with the same size and creates a generic hashmap out of them.
    The first list should be used as the kay and the second as the value.
    if the sizes are different return a SizeDifferenteException*/
    // how will you change it if we want the key to be necessarily a numeric value?


    public static <T extends IShape> void test(T item){
        item.getArea();
    }

}
