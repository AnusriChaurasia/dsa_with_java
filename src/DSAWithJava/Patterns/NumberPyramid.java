package DSAWithJava.Patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
