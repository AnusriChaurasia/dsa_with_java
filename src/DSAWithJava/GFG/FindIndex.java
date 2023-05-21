package DSAWithJava.GFG;

import java.util.Scanner;

public class FindIndex {
    public static void main (String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            Solution ob=new Solution();
            int ar[]=ob.findIndex(arr,n,key);
            System.out.println(ar[0]+" "+ar[1]);
        }
    }
}

class Solution
{
    // Function to find starting and end index
    static int[] findIndex(int a[], int N, int key)
    {
        int i, n=0;
        int temp[] = new int[N];

        for(i=0; i<N; i++){
            if(key == a[i]){
                temp[i]=i;
            }
        }
        return temp;
    }
}