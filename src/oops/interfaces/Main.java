package oops.interfaces;

public class Main {
    public static void main(String[] args) {
//        ElectricCar e1 = new ElectricCar();
//        e1.applyBreaks();

        CarController myCar = new ElectricCar();
        myCar.accelerate();
        myCar.turnRight();
        myCar.turnLeft();
        myCar.applyBreaks();

        System.out.println(":----------------------------:");

        CarController myCar2 = new SportsCar();
        myCar2.accelerate();
        myCar2.turnLeft();
        myCar2.turnRight();
        myCar2.applyBreaks();


    }
}
