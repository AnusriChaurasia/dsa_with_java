package DSAWithJava.Patterns;

import java.util.Scanner;

public class PalindromeNumPatters {
    public static int PalNumPat(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int level = sc.nextInt();
        System.out.print(PalNumPat(level));
    }
}
