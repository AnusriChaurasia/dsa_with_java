package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            fact *= (num-i);
        }

        System.out.println("Factorial of "+num+" is "+fact);
    }

}
