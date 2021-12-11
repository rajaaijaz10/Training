package day12Strings;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Original String = " + args[0]);
        String str=args[0].replace(args[1],args[2]);
        System.out.println("New String = "+str);

    }
}
