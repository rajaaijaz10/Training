package day6;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        byte b = -128;           // -128 to 127
//        short s = -32768;        // -32768 to 32767
//        int i = ;
//        long l;
//        float f;
//        double d;
//        boolean bool;
//        char c;
//        System.out.println(i);
        byte size=0;
        int fsum=0;
        int bsum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of square matrix ..");
        size=scan.nextByte();
        int[][] ary=new int[size][size];
        System.out.println("Enter the "+size*size+" number of elements..");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                ary[i][j] = scan.nextInt();
            }
        }
        System.out.println("The array you inserted :");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(ary[i][j]+"  ");
            }
            System.out.print('\n');
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j)
                    fsum+=ary[i][j];
                if(size-1-j==i)
                    bsum+=ary[i][j];
            }

        }
        System.out.println("Forward diagonal sum = "+fsum);
        System.out.println("Backward diagonal sum = "+bsum);
        System.out.println("Forward + Backward diagonal sum = "+(bsum+fsum));














    }
}
