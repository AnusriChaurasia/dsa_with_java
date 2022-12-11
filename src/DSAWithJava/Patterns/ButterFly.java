package DSAWithJava.Patterns;

import java.util.Scanner;

public class ButterFly {
    public static int ButterFly(int l){
        //first half
        for(int i=1; i<=l; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces;
            for(int j=1; j<=2*(l-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=l-1; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces;
            for(int j=1; j<=2*(l-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level(even number) of the triangle: ");
        int level = sc.nextInt();
        /*do{
            System.out.print("Not even enter again: ");
            level = sc.nextInt();
        }while (level % 2 != 0);*/
        System.out.print(ButterFly(level));
    }
}
