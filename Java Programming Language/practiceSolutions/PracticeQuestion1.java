package practiceSolutions;
import java.util.*;

public class PracticeQuestion1 {
    public static void main(String args[]){

        //Question 1
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number ");
        // int a = sc.nextInt();
        // System.out.println("enter 2nd number");
        // int b = sc.nextInt();
        // System.out.println("enter 3rd number");
        // int c = sc.nextInt();

        // int sum = a + b + c;
        // int avg = sum/3;
        // System.out.println("average of 3 numbers is "+avg);

        //Question 2 
        System.out.println("enter the side of a square");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("area of square is "+area);

        sc.close();
    }
}