package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
    int salary=0;
        System.out.println(args[0]);
        for (byte b=2;b<5;b++){

            salary  = salary + (Integer.parseInt(args[b]));


        }
        salary = salary - Integer.parseInt(args[5]);
        System.out.println("Total salary of "+args[1]+" Having employee ID as "+args[0]+" is Rs."+salary);
    }
}
