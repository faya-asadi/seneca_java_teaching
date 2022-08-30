package Generics.Goods;

public abstract class Goods {

    public Goods(double price){
        this.prise = price;
    }
    public String getName() {     return name;   }
    public void setName(String name) {    this.name = name;    }
    String name;

    public double getPrise() {
        return prise;
    }
    public void setPrise(double prise) {
        this.prise = prise;
    }
    double prise;


    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    double Weight;

    public abstract void PrintSpecifications();

}
