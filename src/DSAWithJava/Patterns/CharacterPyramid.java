package DSAWithJava.Patterns;

import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int row = sc.nextInt();
        System.out.print("Enter the first character to start print: ");
        char sym = sc.next().charAt(0);
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(sym);
                sym++;
            }
            System.out.println();
        }
    }
}
