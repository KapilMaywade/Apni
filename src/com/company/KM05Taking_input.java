package com.company;
import java.util.Scanner;

public class KM05Taking_input {
    public static void main(String[] args) {
        System.out.println("taking data from the user");
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter num 1");
        //int a= sc.nextInt();
        float f1= sc.nextFloat();
        System.out.println("Enter num 2");
        float f2=sc.nextFloat();
        float sum= f1+f2 ;
        // int b= sc.nextInt();
        //int sum= a+b;
        System.out.println("sum of this numbers");
        System.out.println(sum);

    }

}
