package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class Product {
    public static void multiply(int a, int b){
        int prod = a*b;
        System.out.println("Product of "+a+" and "+b+" is: "+prod);
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        multiply(num1,num2);

    }
}
