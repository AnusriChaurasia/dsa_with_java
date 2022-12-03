package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class SumOfDigitsOfInteger {
    public static int SumOfDigits(int num){
        int sum = 0;
        int n = num;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int len = String.valueOf(num).length();
        System.out.print(len);
        //System.out.print("Sum of all digits in "+num+" is :"+SumOfDigits(num));

    }
}
