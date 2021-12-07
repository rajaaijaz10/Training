package day9Interfaces;

public class Eon implements Car {
    @Override
    public void start() {
        System.out.println("EON Started.");
    }

    @Override
    public void brake() {
        System.out.println("EON applied brakes.");

    }

    @Override
    public void changeGear() {
        System.out.println("EON changed gear");

    }

    @Override
    public void stop() {
        System.out.println("EON Stoped");

    }

}
