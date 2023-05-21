package DSAWithJava.HackerearthArray;

import java.util.Scanner;

public class Test {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch[] = new char[s.length()];
        int count = 0, start=0;

        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count++;
            }
        }
       char vow[] = new char[count];
        while(start<count) {
            for (int i = 0; i < s.length(); i++) {
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    vow[start] = ch[i];
                    start++;
                }
            }
        }
        System.out.println();
        while(count>0){
            for (int i = 0; i < s.length(); i++) {
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    ch[i] = vow[count-1];
                    count--;
                }
            }
        }


    }
}
