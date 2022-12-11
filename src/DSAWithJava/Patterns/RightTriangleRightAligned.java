package DSAWithJava.Patterns;

import java.util.Scanner;

public class RightTriangleRightAligned {
    public static int RightTriangle(int l){

        for(int i=1; i<=l; i++){
            for(int j=1; j<=l-i; j++){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of the triangle: ");
        int level = sc.nextInt();
        //int column = sc.nextInt();
        System.out.print(RightTriangle(level));
    }
}
