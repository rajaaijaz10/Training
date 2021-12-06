package day7;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        String[] days={"Monday" ,"Tuesday" ,"Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number from 1 - 7");
        Byte num=scan.nextByte();

        switch(num){
            case 1:
                System.out.println(days[num-1]);
                break;
            case 2:
                System.out.println(days[num-1]);
                break;

            case 3:
                System.out.println(days[num-1]);
                break;
            case 4:
                System.out.println(days[num-1]);
                break;
            case 5:
                System.out.println(days[num-1]);
                break;
            case 6:
                System.out.println(days[num-1]);
                break;
            case 7:
                System.out.println(days[num-1]);
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
