package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[]args){

        int sum=0;
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

        while (i <= num){
            sum = sum + i;
            i++;
        }

        System.out.println("The sum of first "+num+" natural numbers is "+ sum);
    }
}
