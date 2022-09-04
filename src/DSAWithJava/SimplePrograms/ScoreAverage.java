package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[]args){

        int count=1, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects: ");
        int tot = sc.nextInt();

        while (count<=tot){
            System.out.println("Enter the marks for subject "+count);
            int marks = sc.nextInt();
            sum = sum + marks;
            count++;
        }

        float avg = (float)(sum / 25);
        System.out.println("The average of "+tot+" subjects is: "+avg);

    }
}
