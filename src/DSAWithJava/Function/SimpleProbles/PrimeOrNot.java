package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class PrimeOrNot {

    public static boolean isPrime(int n){
        if (n == 1 || n==0){
            System.out.println("Neither prime nor composite.");
            return false;
        }
        if (n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if a number is prime or not-");
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
