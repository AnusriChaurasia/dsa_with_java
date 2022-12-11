package DSAWithJava.Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static int FloydsTriangle(int l){
        int counter = 1;
        for(int i=1; i<=l; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of the triangle: ");
        int level = sc.nextInt();
        System.out.print(FloydsTriangle(level));
    }
}
