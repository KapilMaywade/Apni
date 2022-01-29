package com.company;
import java.util.Scanner;
public class Km06cbscproject {
    public static void main(String[] args) {
        System.out.println("================CALCULATE CBSC PERCENT======================");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sub1 number: ");
        float sub1=sc.nextFloat();
        System.out.println("Enter sub2 number: ");
        float sub2=sc.nextFloat();
        System.out.println("Enter sub3 number: ");
        float sub3=sc.nextFloat();
        System.out.println("Enter sub4 number: ");
        float sub4=sc.nextFloat();
        System.out.println("Enter sub5 number: ");
        float sub5=sc.nextFloat();
        float result = (sub1+sub3+sub2+sub5+sub4)*100/500;
        System.out.println("Your percents is: "+result);
    }

}
