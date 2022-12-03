package DSAWithJava.Function.SimpleProbles;

import java.security.PublicKey;
import java.util.Scanner;

public class DecimalToBinary {

    public static void DecimalToBinary(long dec){
        long num = dec;
        int bin =0, pow=0;
        while(dec>0){
            int rem = (int)dec%2;
            bin = bin +(rem*(int)Math.pow(10,pow));
            pow++;
            dec = dec/2;
        }
        System.out.println("Binary conversion of "+num+" is "+bin);
    }
    public  static  void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number for conversion: ");
        long dec = sc.nextLong();
        DecimalToBinary(dec);
    }
}
