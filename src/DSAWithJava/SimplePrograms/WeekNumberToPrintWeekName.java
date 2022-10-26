package DSAWithJava.SimplePrograms;

import java.util.Scanner;

public class WeekNumberToPrintWeekName {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 1-7 to know the week name:");
        int week = sc.nextInt();

        switch (week){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Please enter a valid number.");
            break;
        }
    }
}
