package oops.interfaces;

import java.io.Serializable;

public class SportsCar implements CarController {

    @Override
    public void accelerate() {
        System.out.println("Sports car ACCELERATE");
    }

    @Override
    public void turnRight() {
        System.out.println("Sports car turn RIGHT");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports car turn LEFT");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Sports car applying BRAKES");
    }
}
