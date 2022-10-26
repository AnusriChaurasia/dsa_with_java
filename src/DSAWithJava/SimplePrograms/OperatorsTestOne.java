package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class OperatorsTestOne {
    public static void main (String[]args){

        /*Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = (a*b/a);
        int y =(a*(b/a));

        System.out.println(x+",");
        System.out.println(y);*/

        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
        }
        if((y+200) > x && (y+150) > z){
            System.out.println("Hello Java");
        }
    }
}
