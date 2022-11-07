package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int temp =0;
        System.out.print("Enter the number you want to reverse: ");
        int num = sc.nextInt();

        int num1 = num, num2 =num;

        //print the reversed number directly without storing it
        while(num1>0){
            System.out.print(num1%10);
            num1 = num1/10;
        }
        System.out.println(" ");
        //print the reversed number after storing it

        while (num2>0){
            temp = (temp*10)+(num2%10);
            num2 = num2/10;
        }
        System.out.println("Temp = "+temp);
    }
}
