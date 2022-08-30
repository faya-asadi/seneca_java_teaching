package Generics;
import Generics.Goods.Goods;

import java.util.ArrayList;
import java.util.List;

public class Store <T extends Goods> {

    List<T> inventory;
    public Store(){
        inventory = new ArrayList<>();
    }

    public void FillInventory(T item){
        inventory.add(item);
    }

    public T getOneItemFromInventory(){
        if(inventory.size() > 0){
            T item = inventory.get(0);
            inventory.remove(0);
            return item;
        }
        return null;
    }

    public void printReport(){
        for (T item: inventory ) {
            item.PrintSpecifications();
        }
    }

}





