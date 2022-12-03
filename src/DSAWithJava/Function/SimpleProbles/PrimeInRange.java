package DSAWithJava.Function.SimpleProbles;

import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime(int n){
        /*if (n == 1 || n==0){
            System.out.println("Neither prime nor composite.");
            return false;
        }*/
        if (n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+", ");
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit of range: ");
        int n = sc.nextInt();
        PrimeInRange(n);
    }

}
