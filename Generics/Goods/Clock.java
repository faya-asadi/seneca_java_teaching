package Generics.Goods;

public class Clock extends Goods{
    public Clock(double price) {
        super(price);
    }

    @Override
    public void PrintSpecifications() {
        System.out.println("I am A clock, and I cost " + prise +"$.");

    }
}
