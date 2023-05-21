package DSAWithJava.Arrays;

import java.util.Scanner;

public class PairsInArray {
    public  static void PrintPair(int arr[], int n){
       int tp=0;
        for(int i=0; i<n; i++){
            int curr=arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("("+curr+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: "+tp);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter "+n+" array elements: ");
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        PrintPair(a,n);
    }
}
