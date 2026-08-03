package Repeatetive;

import java.util.Scanner;

public class Add_Digit_Number {

    static void main() {
        int number;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int sum = 0;

        while (number>0){
            int lastDigit = number%10;
            number = number/10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of all digit: " + sum);
    }
}
