package corejava.someEx;

public class Methods {
    String greeting(){
        return "Welcome";
    }
    public static void main(String[] args) {
        Methods obj = new Methods();
        System.out.println(obj.greeting());
    }
}
