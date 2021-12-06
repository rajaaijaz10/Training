package day8;

import java.util.Scanner;

public class countWithContinue {
    public static void main(String[] args) {
        byte found=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string you want to search in. ");
        char[] ary=scan.nextLine().toCharArray();

        System.out.println("Enter the char you want to search for. ");
        char find=scan.next().charAt(0);
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]!=find){
               continue;
            }
            System.out.println("Char found at location "+i);
            found++;
        }
        if(found==0)
            System.out.println("Char not found");
        else
            System.out.println("Char "+find+" was found "+found+" times");

    }
}

