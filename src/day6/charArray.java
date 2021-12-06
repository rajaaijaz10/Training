package day6;

import java.util.Scanner;

public class charArray {
    public static void main(String[] args) {

        boolean found=false;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string you want to search in. ");
        char[] ary=scan.next().toString().toCharArray();

        System.out.println("Enter the char you want to search for. ");
        char find=scan.next().charAt(0);
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]==find){
                System.out.println("Char found at location "+i);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("Char not found");
    }
}
