package DSAWithJava.Patterns;

import java.util.Scanner;

public class InvertedRightTriangleLeftAligned {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();
        System.out.print("Enter the symbol to print: ");
        char sym = sc.next().charAt(0);
        for (int i=1; i<=row; i++){
            for (int j=1; j<=(row-i)+1; j++){
                System.out.print(sym);
            }
            System.out.println();
        }
    }
}
