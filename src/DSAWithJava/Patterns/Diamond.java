package DSAWithJava.Patterns;

import java.util.Scanner;

public class Diamond {
    public static int DiamondPattern(int n){
        //first half of diamond
        for(int i =1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second half of diamond
        for(int i=n-1; i>=1; i--){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of the diamond: ");
        int level = sc.nextInt();
        //System.out.print("Enter the symbol of the rhombus: ");
        //char ch = sc.next().charAt(0);
        System.out.print(DiamondPattern(level));
    }

}
