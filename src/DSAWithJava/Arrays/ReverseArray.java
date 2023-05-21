package DSAWithJava.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void rev(int arr[], int n){
        int temp=0;
        int start =0, end=n-1;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

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
        rev(a,n);
        System.out.print("Reverse array is :  ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
