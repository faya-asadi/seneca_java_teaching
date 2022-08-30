package Generics;

import Exceptions.UserDefined.SizeDifferenteException;
import Generics.Goods.Goods;

import java.util.HashMap;
import java.util.List;

public class Toolbox {

    public static <T extends Goods> void changeName(T item){

        String name = item.getName();

        String[] splitName = name.split("_");

        if(splitName.length > 1){
            name = String. join(" ", splitName);
            item.setName(name);
        }

    }


    // ArrayList<T> implements List<T>


    public static  <K extends Number, V extends Goods>  HashMap<K, V> generateHashmap(List<K> keys, List<V> values) throws SizeDifferenteException {



        if(keys.size() != values.size()){
            throw new SizeDifferenteException("the size of keys and values does not match!");
        }else{
            System.out.println("the lists have similar size equal to:" + keys.size());
        }
        HashMap<K, V> hp = new HashMap<>();

        for(int i = 0; i<keys.size(); i++){
            K key = keys.get(i);
            V value = values.get(i);
            hp.put(key, value);
        }

        for (K key : keys ) {
            System.out.println( "for key: " + key +"   the value is " + hp.get(key).getName() );

        }

        return hp;
    }

}
