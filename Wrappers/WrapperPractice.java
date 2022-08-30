package Wrappers;

import java.util.ArrayList;

public class WrapperPractice {

    public void intWrapper(){
        int a = 10;
        Integer b = 10;


        Integer ab = a;

        System.out.println(ab.getClass().getName());

        System.out.println(a == b); //true


        ArrayList<Integer> test = new ArrayList<Integer>();

        test.add(a);

        int unboxing = b;

    }

}
