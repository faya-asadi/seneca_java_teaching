package Generics.Frutes;

public class Apple implements  IFruite{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    String name;
    public final String type = "Apple";
}
