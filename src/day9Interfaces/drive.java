package day9Interfaces;

public class drive {
    public static void main(String[] args) {
        Car Alto=new alto();
        Car eon=new Eon();
        Alto.start();
        Alto.changeGear();
        Alto.brake();
        Alto.stop();
        eon.start();
        eon.changeGear();
        eon.brake();
        eon.stop();
    }
}
