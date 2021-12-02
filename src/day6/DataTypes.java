package day6;

public class DataTypes {
    public static void main(String[] args) {
        byte b = -128;           // -128 to 127
        short s = -32768;        // -32768 to 32767
        int i =65 ;
        long l=327878;
        float f=56.7f;
        double d=77.99f;
        boolean bool=true;
        char c =65535;
        System.out.println((char)i);
        // Asci encoded table 128 chars only
        for(byte by=0;by<127;by++){
            System.out.println(by+" --->  "+(char)by);

        }
        // UTF-8 Encoded Table
        for (char ch=0;ch < 65535; ch++)
            System.out.println((int)ch +"  --->  "+ch);
    }
}
