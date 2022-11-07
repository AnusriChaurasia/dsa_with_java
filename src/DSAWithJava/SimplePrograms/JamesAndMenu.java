package DSAWithJava.SimplePrograms;
import java.util.*;

public class JamesAndMenu {
    public static int main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i, j, x=0, y=0;


            int arr[][] = new int[n][m];
            int count[][] = new int[n][m];

            for(i=0; i<n; i++){
                for(j=0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

        int bestMenu = 0;

        long[] bestPrices = new long[m];

        int[] countBestForMenus = new int[n];



        for( i=0; i<m; i++) {

            long max = arr[0][i];



            for( j=0; j<n; j++) {

                max = Math.max(max, arr[j][i]);

            }

            bestPrices[i] = max;

        }



        int maxBestCount = 0;

        for( i=0; i<n; i++) {

            for(j=0; j<m; j++) {

                if(arr[i][j] == bestPrices[j]) {

                    countBestForMenus[i]++;

                }

            }

            maxBestCount = Math.max(maxBestCount, countBestForMenus[i]);



        }



        long[] avgMenus = new long[n];



        for( i=0; i<n; i++) {

            long avg = 0;



            for( j=0; j<m; j++) {

                avg += arr[i][j];

            }

            avg = avg / m;

            avgMenus[i] = avg;

        }



        long maxAvg = 0;

        for( i=0; i<n; i++) {



            if(countBestForMenus[i] == maxBestCount) {

                if(avgMenus[i] > maxAvg) {

                    bestMenu = i+1;

                    maxAvg = avgMenus[i];

                }

            }

        }



        return bestMenu;

    }

}



