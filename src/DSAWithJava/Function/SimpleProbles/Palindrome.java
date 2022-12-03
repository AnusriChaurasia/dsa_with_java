package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class Palindrome {
    public static boolean IsPalindrome(int num){
        int temp = num;
        int pow = String.valueOf(temp).length();
        int sum=0;
        while(temp>0){
            int rem = temp%10;
            sum =sum +  (rem*(int)Math.pow(10,pow-1));
            pow--;
            temp=temp/10;
        }
        if(sum == num){
            return true;
        }

        return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome or not: ");
        int num = sc.nextInt();
        System.out.print(IsPalindrome(num));
    }
}
