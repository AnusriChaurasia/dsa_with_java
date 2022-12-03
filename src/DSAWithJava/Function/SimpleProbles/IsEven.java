package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class IsEven {
    public static boolean IsEven(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num = sc.nextInt();

        if(IsEven(num)){
            System.out.println(IsEven(num));
        }
        else{
            System.out.println(IsEven(num));
        }
        //System.out.print(IsEven(num));
    }
}
