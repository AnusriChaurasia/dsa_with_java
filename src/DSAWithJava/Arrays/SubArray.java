package DSAWithJava.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class SubArray {
    public static int Kadane(int a[]){
        int cs=0, ms=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            cs=+a[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        if(ms==0){
            Arrays.sort(a);
            ms=a[a.length-1];
        }
        return ms;
    }

    public static int Prefix(int a[]){
        //time complexity is O(n^2)
        int prefix[]=new int[a.length];
        int sum=0, max=Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        prefix[0]=a[0];
        for(int i=1; i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                sum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;
    }
    public  static void PrintSubArray(int a[],int n){
        //time complexity is O(n^3)
        int ts=0, sum =0, max=Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(a[k]+" ");
                    sum=sum+a[k];

                }
                ts++;
                //System.out.print(" Sum:"+sum);
                if(max<sum){
                    max=sum;
                }
                if(mini>sum);{
                    mini=sum;
                }
                System.out.println();
                sum=0;
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: "+ts);
        System.out.println("Maximum sub-array sum: "+max);
        System.out.println("Minimum sub-array sum: "+mini);

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

        PrintSubArray(a,n);
        System.out.println("Maximum sub-array sum(using prefix method): " + Prefix(a));
        System.out.println("Maximum sub-array sum(Kadane's Algorithm): " + Kadane(a));
    }
}
