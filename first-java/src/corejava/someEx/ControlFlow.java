package corejava.someEx;

public class ControlFlow {

    /*CONTROL FLOW

        control flow means how yur program executes statements
        based on the condition or loops. Instead of running code line
        by line blindly, You can tell Java:

        JAVA gives us three main types:
        if, else if, else, Switch

        LOOPS -> for, while, do-while, enhanced for-each

        Jump statements -> break, continue
     */

    public static void main(String[] args) {

        // for
        for (int i = 1; i <= 10; i++) {
            if(i == 7) {
                break;           // break stop  6 tak hi print
            }
            System.out.println(i);
        }

        // while
        int n = 5;
        while(n > 0){
//            System.out.println(n);
            n--;
        }

        // do-while
        int num = 3;

        do {
//            System.out.println(num);
            num--;
        } while (num > 0);

        // Enhanced for each
        String[] fruits = {"Apple", "Banana", "Mango"};

        for(String fruit : fruits){
            if(fruit.equals("Banana")){
                continue;               // jump statements
            }
            System.out.println(fruit);
        }
    }
}
