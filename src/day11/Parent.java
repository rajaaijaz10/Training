package day11;

public class Parent {
    String name="Parent";
    public void display(){
        System.out.println("parent class function invoked ");
    }
    protected void display(String s){
        System.out.println("Overloaded Display function value passed = "+s);
    }
    protected void display(int s){
        System.out.println("Overloaded Display function value passed = "+s);
    }
    protected void display(String s , String s1){
        System.out.println("Overloaded Display function with 2 values passed as := "+s+" --- "+s1);
    }

}
