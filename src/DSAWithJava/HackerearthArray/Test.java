package DSAWithJava.HackerearthArray;

import java.util.Scanner;

public class Test {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        //int T = s.nextInt();
        int count=0;

        /*for(int i = 0; i < T; i++){

            int n = sc.nextInt();
            int m = sc.nextInt();
            String[][] arr = new String[n][1];

            for (int j = 0; j < n; j++){
                arr[j][0] = sc.next();
            }

            String s1 = sc.next();
            int l = 0;
            boolean ans = true;
            while (s1.length() != l){

                if (arr[l%n][0].contains(String.valueOf(s1.charAt(l)))){
                    ans = true;
                    arr[l%n][0] = arr[l%n][0].replaceFirst(String.valueOf(s1.charAt(l)),"");
                }

                else {
                    ans = false;
                    break;
                }
                l+=1;

            }

            if (ans == true){
                System.out.println("Yes");
            }

            else{
                System.out.println("No");
            }

        }*/

        int n = s.nextInt();
        s.nextLine(); // Not sure if necessary,  might avoid some issues
        int x = s.nextInt();
        int y = s.nextInt();
        s.nextLine(); // Not sure if necessary,  might avoid some issues

        for (int i = 0; i < y; i++) {
            String currentLine = s.nextLine();
            for (int j = 0; j < x; j++) {
                System.out.println(currentLine.charAt(j));
            }
        }

    }
}
