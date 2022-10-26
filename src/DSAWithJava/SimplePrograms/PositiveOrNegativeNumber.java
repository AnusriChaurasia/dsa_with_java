package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check if positive or negative: ");
        float a = sc.nextFloat();

        if (a < 0.0){
            System.out.println("The number you entered is negative.");
        }

        else if(a > 0.0){
            System.out.println("The number you entered is positive.");
        }

        else{
            System.out.println("The number is zero.");
        }
    }
}
