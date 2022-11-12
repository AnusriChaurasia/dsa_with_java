package DSAWithJava.Patterns;

import java.util.Scanner;

public class FloydTriangle {
    /*public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();
        int temp =1;

        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }*/

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();
        int temp =1;

        for (int i=1; i<=row; i++){
            for (int j=1; j<=(row-i)+1; j++){
                System.out.print(" ");
                //temp++;
            }
            System.out.println("*");
        }
    }

}
