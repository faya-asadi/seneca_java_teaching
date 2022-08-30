package Interfaces.RobotsFlyingObject;

public class RobotChicken implements IRobot, IFlyingObject{

    public RobotChicken(int eggLayingRate, String name){
        this.name = name;
        this.eggLayingRate = eggLayingRate;
    }

    public RobotChicken(){}

    public int getEggLayingRate() {
        return eggLayingRate;
    }

    public void setEggLayingRate(int eggLayingRate) {
        this.eggLayingRate = eggLayingRate;
    }

    int eggLayingRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public void speak(){
        System.out.println("Squawk squawk, beep beep");
    }

    @Override
    public int getFlyingDistance() {
        return 250;
    }

    @Override
    public int calculateChargingTime() {
        return eggLayingRate * 2;
    }

    @Override
    public void selfDestruct() {
        eggLayingRate = 0;
    }
}
