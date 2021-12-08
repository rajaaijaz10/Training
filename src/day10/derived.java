package day10;

public class derived extends base implements interface1{


    @Override
    public void add(int a, int b) {
        System.out.println("Sum = "+(a+b));
    }

    @Override
    public void multiple(int a, int b) {
        System.out.println("Product = "+(a*b));

    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Difference = "+(a-b));

    }


}
