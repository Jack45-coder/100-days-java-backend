package corejava.collections;

import java.util.ArrayList;
import java.util.List;

class Car{
    String brand;

    Car(String brand){
        this.brand = brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Jackey");
        users.add("Shivam");
        users.add("Abdullah");
        users.add("Faisal");
//        users.add(6);

        System.out.println(" == All Users == ");
        for(String user : users){
            System.out.println(user);
        }

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford");
        Car car3 = new Car("Sierra");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        System.out.println("All Cars");
        for(Car car : carList){
            System.out.println(car.brand);
        }
    }
}
