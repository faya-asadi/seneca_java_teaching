package Interfaces.HeavyMover;

public class Crane implements HeavyMover{

    private  int gassAmount;

    public Crane (int gass){
        this.gassAmount = gass;
    }
    public Crane(){}


    public int getGassAmount() {
        return gassAmount;
    }

    public void setGassAmount(int gassAmount) {
        this.gassAmount = gassAmount;
    }

    boolean hasGass(){
        return gassAmount > 0;
    }


    @Override
    public void movesObject() {
        if(hasGass()){
            gassAmount--;
            System.out.println("Moving object now!");
        }else{
            System.out.println("Cannot move object, not enough gass");
        }
    }
}
