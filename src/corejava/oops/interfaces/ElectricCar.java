package corejava.oops.interfaces;

public class ElectricCar implements CarController{

    @Override
    public void accelerate(){
        System.out.println("Electric car ACCELERATE");
    }

    @Override
    public void turnRight(){
        System.out.println("Electric car turn RIGHT");
    }

    @Override
    public void turnLeft(){
        System.out.println("Electric car turn LEFT");
    }

    @Override
    public void applyBreaks(){
        System.out.println("Electric car applying BRAKES");
    }

}
