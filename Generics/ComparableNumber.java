package Generics;

public class ComparableNumber<T extends Number> implements Comparable <ComparableNumber<T>>   {

    T value;
    public void setValue(T val){
        this.value = val;
    }
    public T getValue(){
        return value;
    }

    @Override
    public int compareTo(ComparableNumber<T> o) {
        if (this.value.doubleValue() == o.value.doubleValue()) {
            return 0;
        } else if (this.value.doubleValue() > o.value.doubleValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}
