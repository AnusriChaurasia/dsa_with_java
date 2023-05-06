package DSAWithJava.Patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static int NumberPyramid(int n){
        int counter =1;
        for(int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //patters
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
            }
            counter++;
            System.out.println();
        }
        return 0;
    }

    public static int NumRightTriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();

        System.out.println(NumberPyramid(row));
        System.out.println(NumRightTriangle(row));

    }
}
