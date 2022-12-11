package DSAWithJava.Patterns;

import java.util.Scanner;

public class NumberHalfPyramidInverted {
        public static int NumHalfPyrmd(int l){

            for(int i=1; i<=l; i++){
                for(int j=1; j<=(l-i+1); j++){
                    System.out.print(j);
                }
                System.out.println();
            }

            return 0;
        }

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the level of the triangle: ");
            int level = sc.nextInt();
            System.out.print(NumHalfPyrmd(level));
        }
}
