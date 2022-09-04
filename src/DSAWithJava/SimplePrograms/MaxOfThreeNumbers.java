package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("Greatest number is "+a);
            }
        }
        else if (b>a) {
            if(b>c){
                System.out.println("Greatest number is "+b);
            }
        }
        else {
            System.out.println("Greatest number is "+c);
        }
    }
}
