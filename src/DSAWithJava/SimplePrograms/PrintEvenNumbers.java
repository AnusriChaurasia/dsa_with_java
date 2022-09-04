package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number between which you wish to find the even numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a<b){
            if (a%2==0){
                System.out.println(a);
            }
            a=a+1;
        }
    }
}
