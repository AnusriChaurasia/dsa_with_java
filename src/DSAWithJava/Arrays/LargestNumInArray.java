package DSAWithJava.Arrays;

import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int pos=0, ind=0;
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter array elements: ");

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        for(int i=0; i<size; i++){
            if(largest<arr[i]){
                largest = arr[i];
                pos = i;
            }
            if(smallest > arr[i]){
                smallest = arr[i];
                ind = i;
            }
        }

        System.out.println("The largest value in the array is "+largest+" at index "+pos);
        System.out.print("The smallest value in the array is "+smallest+" at index "+ind);
    }
}
