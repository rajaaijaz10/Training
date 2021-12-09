package day11;

public class Child extends Parent{
    String name="Child";
    public void display(){
        System.out.println("child class function invoked");
        System.out.println("This.name =  "+this.name);
        System.out.println("Super.name = "+super.name);
        super.display();
        this.display("Hello");
    }
    protected void display(String s){
        System.out.println("Display function value passed = "+s);
    }

    public static void main(String[] args) {
        Parent obj1=new Parent();
        Child obj=new Child();
        obj.display();

        System.out.println();
        obj1.display();

    }
}
