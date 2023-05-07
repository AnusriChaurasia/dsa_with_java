package DSAWithJava.Arrays;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int marks[] = new int[3];
        String sub[] = {"Physics", "Chemistry", "Maths"};
        for(int i=0; i< marks.length; i++){
            System.out.print(sub[i] +": " );
            marks[i]=s.nextInt();
        }
    }
}
