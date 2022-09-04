package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class AresOfCircle {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius = ");
        int radius = sc.nextInt();

        float area = (float) ((22/7)*radius*radius);

        System.out.println("The area of the circle is "+area);
    }
}
