package day7;

public class Operators {
    public static void main(String[] args) {
        byte b=23;
        byte c=67;
        int sum=b+c;     // Adding two byte will return Integer
//        byte diff=c-b;   Subtracting two byte will return Integer
        int diff=c-b;
        byte q= (byte) (c/b);
        // so performing + , - , / , *  on byte will always return int.
        boolean bool=(b==c || b<=25);
        System.out.println(bool);
        bool= (b!=c && c>=65 );
        System.out.println(bool);
        float f=c/b;
        System.out.println(f);

    }
}
