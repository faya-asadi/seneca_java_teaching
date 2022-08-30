import java.util.HashMap;
import java.util.Map;

public class Fibo {


    Map<Integer, Integer> cache;

    public Fibo(){
        cache = new HashMap<>();
    }

    public int createFibo(int index){

        System.out.println("index: " + index);
         int fiboItem;

        if(index == 1){
            fiboItem = 0;
        }else if(index == 2){
            fiboItem = 1;
        } else if(cache.containsKey(index)){
            fiboItem = cache.get(index);
        }
        else{
            int fibolast, fibolastlast;
            if(cache.containsKey(index-1)){
                fibolast = cache.get(index-1);
            }else{
                fibolast = createFibo(index - 1);
            }
            if(cache.containsKey(index-2)){
                fibolastlast = cache.get(index-2);
            }else{
                fibolastlast = createFibo(index - 2);
            }
            fiboItem = fibolast + fibolastlast;
        }
        if(!cache.containsKey(index)) {
            cache.put(index, fiboItem);
        }
        System.out.println("fibo item for index" + index+ " is: "+ fiboItem);
        return fiboItem;
    }


}

