package Generics.Goods;

public class Shirt extends Goods{
    public Shirt(double price) {
        super(price);
    }

    @Override
    public void PrintSpecifications() {
        System.out.println("This is a shirt.");
        System.out.println("The price is:" + getPrise());
    }

}
