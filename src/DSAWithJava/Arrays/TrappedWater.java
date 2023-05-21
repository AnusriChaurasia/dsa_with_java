package DSAWithJava.Arrays;

import java.util.Scanner;

public class TrappedWater {

    public static int trappedRainWater(int height[],int N){

        //calculate the left max boundary
        int leftMax[] = new int[N];
        leftMax[0]=height[0];
        for(int i=1; i<N; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate the right max boundary
        int rightMax[] = new int[N];
        rightMax[N-1] = height[N-1];
        for(int i=N-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0; i<N; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water= waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int N = s.nextInt();

        System.out.print("Enter the heights (space separated): ");
        int height[]= new int[N];
        for(int i=0; i<N; i++){
            height[i]=s.nextInt();
        }

        System.out.print("The quantity of water trapped: "+trappedRainWater(height,N));
    }
}
