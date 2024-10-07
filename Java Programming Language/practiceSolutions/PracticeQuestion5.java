package practiceSolutions;

import java.util.Scanner;

public class PracticeQuestion5 {
    /*//Question 1 - java method to compute the average of three numbers.
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
    */

    /*//Question 2 - a method to find if a number is even or not. 
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n = sc.nextInt();
        System.out.println("Is "+n+" even? "+isEven(n));

        sc.close();
    }
    */

    //Question 3 - program to check if a number if palindrome or not.
    public static boolean ispalindrome(int x){
        int num = x;
        int rev = 0;

        while(x>0){
            int lastDigit = x % 10;
            rev = rev*10 + lastDigit;
            x /=10;
        }
        if(num == rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int x = sc.nextInt();
        System.out.println("Is "+x+" a palindrome? "+ispalindrome(x));

        sc.close();
    }
}
