package Repeatetive;

import java.util.Scanner;

public class Sum_of_multiple_number {

    // Java program to find sum of numbers entered by user

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of number: ");
        int count;
        count = sc.nextInt();
        System.out.println("Enter number: ");
        int number, sum=0;

        for (int i = 0; i<count; i++){
            number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println(sum);
    }

}
