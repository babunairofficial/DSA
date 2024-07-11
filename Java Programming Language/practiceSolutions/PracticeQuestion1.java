package practiceSolutions;
import java.util.*;

public class PracticeQuestion1 {
    public static void main(String args[]){

        //Question 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter 3rd number");
        int c = sc.nextInt();

        int sum = a + b + c;
        int avg = sum/3;
        System.out.println("average of 3 numbers is "+avg);

        sc.close();
    }
}