package com.company;
import java.util.*;

public class loops {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int input;

            do {
                int marks = sc.nextInt();
                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <= 89) {
                    System.out.println(" also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("Good as well");
                } else  {

                    System.out.println("Invaliid");
                }

                System.out.println("Want to continue ? (yes(1) or no(0))");
                input = sc.nextInt();

            } while(input == 1);
        }

    }

