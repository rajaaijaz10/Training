package day10;

public interface interface1 extends interface2,interface3 {
    static String name="Hyder";
    public void add(int a, int b);
    default void hello(){
        System.out.println("Hello from interface 1, (DEFAULT FUNCTION)");
    }

}
