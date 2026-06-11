package corejava.functionalInterface.inbuilt;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // Represents a supplier of results.
        Supplier<LocalDate> currentDate = LocalDate::now;

        // methodReference
        Supplier<Double> randomNum = Math::random;

        System.out.println(currentDate.get());
        System.out.println(randomNum.get());
    }
}