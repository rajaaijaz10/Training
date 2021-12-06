package day8;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int find;
        boolean found=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of 1D array ..");
        byte size = scan.nextByte();
        int[] ary = new int[size];
        System.out.println("Enter the " + size + " number of elements..");
        for (int i = 0; i < size; i++) {

            ary[i] = scan.nextInt();

        }
        System.out.println("Enter Element to be found");
        find=scan.nextInt();
        for (int i = 0; i < size; i++) {

            if(ary[i]==find)
            {
                System.out.println("element found at location "+i+1);
                found=true;
                break;

            }

        }
        if(! found)
            System.out.println("Element Not present in the given array");
    }
}
