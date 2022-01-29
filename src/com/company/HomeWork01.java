package com.company;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println("======Welcome To calculator=====");
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter value of number one: ");
        float num1= sc.nextFloat();
        System.out.println("Please Enter value of Number two :");
        float num2= sc.nextFloat();
        System.out.println("Please select your operation \n 1 = for + \n 2 = for - \n 3 = for * \n 4 = for /");
        int opr= sc.nextInt();
        if (opr == 1){
            float result  = num1+num2;
            System.out.println("Your result for + is: "+result);
        }
        else if (opr == 2){
            float result  = num1-num2;
            System.out.println("Your result for - is: "+result);
        }
        else if (opr == 3){
            float result  = num1*num2;
            System.out.println("Your result for * is: "+result);
        }
        else if (opr == 4){
            float result  = num1/num2;
            System.out.println("Your result for / is: "+result);
        }else {
            System.out.println("Please select correct operation");
        }


    }
}
