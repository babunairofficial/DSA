package practiceSolutions;
import java.util.*;
public class PracticeQuestion3 {
    public static void main(String[] args){
        
        //question1
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a number");
        int number = sc.nextInt();
        if(number>=0){
            System.out.println("the number is positive");
        } else{
            System.out.println("the number is negative");
        }
        
        sc.close();
    }
}
