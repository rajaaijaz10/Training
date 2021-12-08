package day10;

public class classMain extends absClass {
    public static void main(String[] args) {
        derived obj=new derived();
        obj.add(2,8);
        obj.multiple(3,7);
        obj.sub(22,11);
        obj.hello();
        obj.wish();
       classMain aobj=new classMain();
       aobj.greeting();
       aobj.display();
        System.out.println("variable value of base class is "+obj.rate);
        System.out.println("Variable value of interface1 is "+interface1.name);
        System.out.println("Variable value of interface1 via derived is "+derived.name);
        System.out.println("Variable value of interface2 is "+interface1.university);

    }

    @Override
    void display() {
        System.out.println("hello from Abstract function of abstract class");
    }
}
