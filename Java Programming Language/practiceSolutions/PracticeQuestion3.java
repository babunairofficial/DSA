package practiceSolutions;
import java.util.*;
public class PracticeQuestion3 {
    public static void main(String[] args){
        
        //question1
        /* 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a number");
        int number = sc.nextInt();
        if(number>=0){
            System.out.println("the number is positive");
        } else{
            System.out.println("the number is negative");
        }
        */

        //question 2 - Print you have a fever if your temperature is above 100 and otherwise print you dont have a fever
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your fever");
        double temperature = sc.nextDouble();
        if(temperature > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You dont have a fever");
        }
        */

        //question 3 - Write a java program to input week number (1-7) and print day of week name using switch case.
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a week number (1- 7)");
        int weekNum = sc.nextInt();
        switch (weekNum) {
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
          }
        */

        //question 4
        /*output would be x= false & y= 63 */

        //question 5 - write a program that takes a year from the user and print whether that year is a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year = sc.nextInt();
        if(
          (year % 400 == 0)|| 
          ((year % 4 == 0)&& (year % 100 != 0))
          ){
          System.out.println("Leap Year");
        }else{
          System.out.println("Not a leap year");
        }

        sc.close();
    }
}
