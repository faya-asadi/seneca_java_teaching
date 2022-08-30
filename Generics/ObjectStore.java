package Generics;

import Generics.Frutes.Apple;
import Generics.Frutes.IFruite;
import Generics.Frutes.Orange;

public class ObjectStore<T extends IFruite> {

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void print(){
        System.out.println(obj.toString());
    }

    T obj;




}
