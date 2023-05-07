package DSAWithJava.Arrays;

import java.util.Scanner;

public class ArrayasFuncArug {

    public static void update(int marks[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Do you want to add number?(Y/N) ");
        char ch = s.next().charAt(0);

        if(ch=='Y'){
            System.out.print("Enter the number: ");
            int num = s.nextInt();
            for(int i=0; i<3; i++){
                marks[i]=marks[i]+ num;
            }
            for(int i=0; i<3; i++){
                System.out.println(marks[i]);
            }
        }

    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int marks[]=new int[3];
        System.out.println("Enter the marks:");
        for(int i=0; i<3; i++){
            marks[i]=s.nextInt();
        }

        update(marks);
    }
}
