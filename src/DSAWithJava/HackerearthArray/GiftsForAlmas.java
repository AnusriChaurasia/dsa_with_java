package DSAWithJava.HackerearthArray;

import java.util.Scanner;

public class GiftsForAlmas {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        int temp[][] = new int[n][n];

        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=s.nextInt();
            }
        }

        char rl = s.next().charAt(0);

        if(rl=='R'){
            // to rotate 90 degree right
            //step 1 - transpose matrix

            for (int i=0; i<n; i++){
                for(int j=n-1; j>=0; j--){
                    temp[i][n-j-1]= arr[j][i];
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(temp[i][j]+" ");
                }
                System.out.println();
            }
        }

        if(rl=='L'){
            // to rotate 90 degree left
            //step 1 - transpose matrix
            for (int i=n-1; i>=0; i--){
                for(int j=0; j<n; j++){
                    temp[n-i-1][j]= arr[j][i];
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(temp[i][j]+" ");
                }
                System.out.println();
            }
        }


    }
}
