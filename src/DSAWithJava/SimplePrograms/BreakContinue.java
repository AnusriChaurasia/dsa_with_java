package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class BreakContinue {
    public  static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your range: ");
        int i = sc.nextInt();
         for( int x=1; x<i; x++){

             if(x%10==0){
                 continue;
             }
             System.out.println(x);

         }
    }
}
