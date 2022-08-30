package Interfaces.HeavyMover;

public class Elephant implements  HeavyMover{
    @Override
    public void movesObject() {
        System.out.println("I am moving objects with my trunk!");
    }
}
