package DSAWithJava.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int Array(int arr[], int key, int n){
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]< key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the key you want to search in array: ");
        int key = s.nextInt();
        Arrays.sort(arr);

        System.out.print("Your key is found at: " + Array(arr, key, n));
    }
}
