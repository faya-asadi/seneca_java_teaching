package Interfaces.ShapeLab;

public class Square implements  IShape2{
    @Override
    public void Introduce() {
        System.out.println("Hello I’m Square, I have one side");
    }

    @Override
    public void CalculateArea() {
        System.out.println("Aea: side * Side");
    }

    @Override
    public void CalculateEnvironment() {
        System.out.println("Environment: 4* side");
    }
}
