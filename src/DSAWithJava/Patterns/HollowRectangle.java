package DSAWithJava.Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static int Hollowrect(int r, int c){

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){

                if(i==1 || i==r || j==1 || j==c ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the rows and columns respectively: ");
         int row = sc.nextInt();
         int column = sc.nextInt();
         System.out.print(Hollowrect(row,column));
    }
}
