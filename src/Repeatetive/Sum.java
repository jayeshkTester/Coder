package Repeatetive;

import java.util.Scanner;

public class Sum {

    // Java program to find sum of numbers entered by user

    public static void main(String[] args){

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2 = sc.nextInt();

        System.out.println("Sum of both number is: " + (num1+num2));

    }

}
