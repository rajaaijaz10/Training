package day9;

public class innerDemoExt {
    public static void main(String[] args) {
        innerClass obj=new innerClass();
        innerClass.inner in=obj.new inner();
        in.msg();
        
    }
}
