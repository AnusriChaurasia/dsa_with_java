package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class SumOfEvenOddIntegers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num, temp, sum_even =0, sum_odd = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while(num>0){
            temp = num%10;
            if(temp%2==0 || temp==0){
                sum_even += temp;
            }
            else{
                sum_odd += temp;
            }

            num = num/10;
        }

        System.out.println("Sum of even integers: "+sum_even);
        System.out.println("Sum of odd integers: "+sum_odd);
    }
}
