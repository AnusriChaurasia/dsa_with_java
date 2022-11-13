package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class BinomialCoefficient {
    public static int binomial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find Binomial Coefficient - ");
        System.out.print("Enter value of 'n': ");
        int n = sc.nextInt();
        System.out.print("Enter value of 'r': ");
        int r = sc.nextInt();

        do {
            System.out.print("Please enter a value less than "+n+": ");
            r = sc.nextInt();
        }while (r>n);

        int bin_coef = binomial(n)/(binomial(r)*binomial(n-r));

        System.out.println("The binomial coefficient is: "+bin_coef);


    }
}
