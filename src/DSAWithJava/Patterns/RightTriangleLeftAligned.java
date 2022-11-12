package DSAWithJava.Patterns;

import java.util.Scanner;

public class RightTriangleLeftAligned {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();
        System.out.print("Enter the symbol to print: ");
        char sym = sc.next().charAt(0);
        for (int i=0; i<row; i++){
            for (int j=0; j<=i; j++){
                System.out.print(sym);
            }
            System.out.println();
        }
    }
}
