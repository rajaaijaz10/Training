package day9;

public class innerClass {
    String name="Yash";

    class inner{
        void msg(){
            System.out.println("inner class accessing outer class string as "+name);
        }
    }

    public static void main(String[] args) {
        innerClass in=new innerClass();
        innerClass.inner innerobj= in.new inner();
        innerobj.msg();
    }





}
