package DSAWithJava.Patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static int SolidRhombus(int l, char sym){

        for(int i=1; i<=l; i++){
            //spaces
            for(int j=1;j<=(l-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=l;j++){
                System.out.print(sym);
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
        System.out.print(SolidRhombus(level, ch));
    }
}
