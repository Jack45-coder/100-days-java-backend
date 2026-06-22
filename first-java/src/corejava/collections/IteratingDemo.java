package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
        integers.add(5);
        integers.add(4);

        //For_Each Loop
        for (Integer i : integers){
            System.out.print(i + " ");
        }

        System.out.println();

        //For Loop
        for (int i = 0; i < integers.size(); i++){
            System.out.print(integers.get(i) + " ");
        }

        System.out.println();

        // Iterator
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
//            System.out.print(it.next() + " ");
            if(it.next().equals(5)){
                it.remove();
            }
        }
        for (Integer integer : integers){
            System.out.print(integer + " ");
        }
    }
}
