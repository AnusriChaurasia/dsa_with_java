package DSAWithJava.Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static int HollowRhombus(int l, char sym){

        for(int i=1; i<=l; i++){
            //spaces
            for(int j=1;j<=(l-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=l;j++){
                if (i==1 || j==l || j==1 || i==l){
                    System.out.print(sym);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of the rhombus: ");
        int level = sc.nextInt();
        System.out.print("Enter the symbol of the rhombus: ");
        char ch = sc.next().charAt(0);
        System.out.print(HollowRhombus(level, ch));
    }
}
