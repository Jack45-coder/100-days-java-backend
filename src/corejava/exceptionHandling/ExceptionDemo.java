package corejava.exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();
//        int res = a/0;

        try {
            // EXCEPTION GENERATING STATEMENT
            System.out.println(a/b);
        }catch (ArithmeticException e){
            //EXCEPTION HANDLING STATEMENT
            System.out.println("Divide By Zero Not Allowed " + e.getMessage().toUpperCase());
        }finally {
            sc.close();
        }
    }
}
