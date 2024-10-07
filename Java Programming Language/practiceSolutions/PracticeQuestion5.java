package practiceSolutions;

import java.util.Scanner;

public class PracticeQuestion5 {
    //Question 1 - java method to compute the average of three numbers.
    public static double avg(int a, int b, int c){
        return (double)(a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter 3rd number");
        int c = sc.nextInt();

        System.out.println("average of "+a+", "+b+", "+c+" is "+avg(a,b,c));

        sc.close();
    }
}
