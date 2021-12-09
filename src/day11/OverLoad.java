package day11;

public class OverLoad {
    public static void main(String[] args) {
        Parent obj =new Parent();
        obj.display();
        obj.display(12);
        obj.display("Hello");
        obj.display("Hello","World");
    }
}
