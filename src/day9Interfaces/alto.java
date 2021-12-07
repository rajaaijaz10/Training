package day9Interfaces;

public class alto implements Car{
    @Override
    public void start() {
        System.out.println("Alto Started.");
    }

    @Override
    public void brake() {
        System.out.println("Alto applied brakes.");

    }

    @Override
    public void changeGear() {
        System.out.println("Alto changed gear");

    }

    @Override
    public void stop() {
        System.out.println("Alto Stoped");

    }
}
