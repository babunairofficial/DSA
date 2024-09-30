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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your fever");
        double temperature = sc.nextDouble();
        if(temperature > 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You dont have a fever");
        }

        sc.close();
    }
}
