package DSAWithJava.HackerearthArray;

import java.util.Scanner;

class FindTheString {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count=0;

        while(t>0) {
            int n = s.nextInt();
            int m = s.nextInt();
            char arr[][] = new char[n][m];
            for(int i=0; i<n; i++){
                 for(int j=0; j<1; j++) {
                     arr[i][j] = s.next().charAt(0);
                 }
            }
            String str = s.next();
            int len = str.length();
            char ch[]=str.toCharArray();


            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++) {
                    for(int x=0; x<len; x++) {
                        if (arr[j][i] == ch[x]) {
                            //System.out.println("Yes");
                            count++;
                            break;
                        }
                    }
                }

            }

            if(len == count){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            t--;
        }

    }

}

