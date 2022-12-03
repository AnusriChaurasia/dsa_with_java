package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void BinaryToDecimal(long binNum){
        long num = binNum;
        int dec =0;
        int pow =0;

        while(binNum>0){
            int ld =(int) binNum%10;
            dec = dec + (int)(Math.pow(2,pow))*ld;
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal conversion of "+num+" is "+dec);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number for conversion: ");
        long binNum = sc.nextLong();
        BinaryToDecimal(binNum);
    }
}
