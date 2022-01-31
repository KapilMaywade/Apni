package com.company;
import java.util.*;
public class Loops_Home_work1 {
    public static void main(String[] args) {
        System.out.println("please write number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%1 == 1) {
            System.out.println("number from 100");
        }
        do {
            int i = sc.nextInt();
            if (i >= 90) {
                System.out.println("this is good");
            } else if (i>=80){
                System.out.println("this is also good");
            }
            else if (i<80){
                System.out.println("good also");
            }
        } while (a<100);
    }

}
