package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void  main(String[]args){

        int div = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        while (div<num){
            if(num%div==0){
                System.out.println("Not a prime number");
                break;
            }
            else{
                div = div + 1;
            }
        }

        System.out.println("Prime Number");
    }
}
