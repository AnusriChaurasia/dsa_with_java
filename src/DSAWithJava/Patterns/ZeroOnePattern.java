package DSAWithJava.Patterns;

import java.util.Scanner;

public class ZeroOnePattern {
    public static int ZeroOne(int l){
        for(int i=1; i<=l; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of the triangle: ");
        int level = sc.nextInt();
        System.out.print(ZeroOne(level));
    }
}
