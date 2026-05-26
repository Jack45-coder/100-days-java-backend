package functionalInterface.assignment;

public class Addition implements Operation{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}
