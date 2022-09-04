package DSAWithJava.SimplePrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleBill {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of commodities: ");
        int tot_item = sc.nextInt();
        float price[]=new float[tot_item];
        float sum =0;
        int i=0;
        System.out.println("Enter the commodity followed by price :");

         while(i<tot_item){
             String commodity = sc.next();
             price[i] = sc.nextFloat();
             i++;
         }

         for(i=0;i<tot_item;i++){
             sum +=price[i];
         }


         float gst = (float) (sum + sum * 0.18);

         System.out.println("Your bill is: "+df.format(gst)+" INR");
    }
}
