package corejava.exceptionHandling;

import java.util.Arrays;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7};

        try {
            for (int i : arr){
                System.out.println(i + " "); // print array elements
            }
            System.out.println(+ arr[6]); // catch -> throws ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage()); // handles the exception in catch block
        }finally {
            System.out.println("Done"); // always executes whether exception occurs or not
        }
    }
}